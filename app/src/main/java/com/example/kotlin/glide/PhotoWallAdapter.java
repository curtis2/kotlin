package com.example.kotlin.glide;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.kotlin.R;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhotoWallAdapter extends ArrayAdapter<String> implements AbsListView.OnScrollListener {

    /**
     * 记录所有下载或者等待下载的任务
     */
    private Set<BitmapWorkerTask> taskCollection;

    /**
     * 图片缓存技术核心类，用于缓存所有下载好的图片，在程序内存达到设定值时，会将最少最近使用的图片移除
     */
    private LruCache<String,Bitmap> mMemoryCache;


    private GridView mPhotoWall;

    /**
     * 第一张可见图片下标
     */
    private int mFirstVisibleItem;

    /**
     * 一屏有多少张图片可见
     */
    private int mVisibleItemCount;


    /**
     * 是否初次进入
     */
    private boolean isFirstEnter=true;

    public PhotoWallAdapter(@NonNull Context context, int resource, @NonNull String[] objects, GridView photoWall) {
        super(context, resource, objects);
        mPhotoWall=photoWall;
        taskCollection=new HashSet<>();

        int maxMemory= (int) Runtime.getRuntime().maxMemory();
        int cacheSize=maxMemory/8;
        Log.d("adapter","maxMemory="+maxMemory+"byte");
        mMemoryCache=new LruCache<String,Bitmap>(cacheSize){
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getByteCount();
            }
        };

        mPhotoWall.setOnScrollListener(this);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final String url=getItem(position);
        View view;
        if(convertView==null){
            view= LayoutInflater.from(getContext()).inflate(R.layout.photo_layout,null);
        }else {
            view=convertView;
        }
        final ImageView photo=(ImageView) view.findViewById(R.id.photo);
        photo.setTag(url);
        setImageView(url,photo);
        return view;
    }

    /**
     * 给ImageView 设置图片，首先从缓存中取出图片，
     * @param ImageUrl
     * @param imageView
     */
    private void setImageView(String ImageUrl, ImageView imageView) {
         Bitmap bitmap=getBitmapFromMemoryCache(ImageUrl);
         if(bitmap!=null){
             imageView.setImageBitmap(bitmap);
         }else {
             imageView.setImageResource(R.drawable.ic_launcher_background);
         }
    }

    /**
     * 将一张照片存储入缓存中
     * @param key  lruCache 的键，图片的url地址
     * @param bitmap  lruCache 的值，传入从网络下载的bitmap对象
     */
    private void addBitmapToMemoryCache(String key,Bitmap bitmap){
        if(getBitmapFromMemoryCache(key)==null){
            mMemoryCache.put(key,bitmap);
        }
    }

    /**
     * 从缓存中取出图片
     * @param imageUrl
     * @return
     */
    private Bitmap getBitmapFromMemoryCache(String imageUrl) {
     return mMemoryCache.get(imageUrl);
    }


    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        //当Gridview 静止时才去加载图片
        if(scrollState==SCROLL_STATE_IDLE){
            loadBitmaps(mFirstVisibleItem,mVisibleItemCount);
        }else{
            cancelAllTasks();
        }
    }

    /**
     *  加载Bitmap对象，遍历当前屏幕所有的item，并查看在cache中有没有，没有就启动异步线程去下载
     * @param mFirstVisibleItem
     * @param mVisibleItemCount
     */
    private void loadBitmaps(int mFirstVisibleItem, int mVisibleItemCount) {
        try{
            for (int i = mFirstVisibleItem; i <mFirstVisibleItem+mVisibleItemCount ; i++) {
               String imageUrl=Images.imageThumbUrls[i];
               Bitmap bitmap=getBitmapFromMemoryCache(imageUrl);
               if(bitmap==null){
                BitmapWorkerTask task=new BitmapWorkerTask();
                taskCollection.add(task);
                 task.execute(imageUrl);
               }else {
                   ImageView imageView=mPhotoWall.findViewWithTag(imageUrl);
                   if(imageView!=null&&bitmap!=null){
                       imageView.setImageBitmap(bitmap);
                   }
               }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 取消所有下载任务
     */
    public void cancelAllTasks() {
        if(taskCollection!=null){
            for(BitmapWorkerTask task:taskCollection){
                task.cancel(false);
            }
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
       mFirstVisibleItem=firstVisibleItem;
       mVisibleItemCount=visibleItemCount;
       if(isFirstEnter&&visibleItemCount>0){
           loadBitmaps(mFirstVisibleItem,visibleItemCount);
           isFirstEnter=false;
       }
    }


    /**
     * 异步下载任务
     */
    class BitmapWorkerTask extends AsyncTask<String,Void, Bitmap>{

        private String imageUrl;

        @Override
        protected Bitmap doInBackground(String... params) {
            imageUrl=params[0];
             Bitmap bitmap=downloadBitmap(params[0]);
             if(bitmap!=null){
                 addBitmapToMemoryCache(params[0],bitmap);
             }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            ImageView imageView=mPhotoWall.findViewWithTag(imageUrl);
            if(imageView!=null&&bitmap!=null){
                imageView.setImageBitmap(bitmap);
            }
            taskCollection.remove(this);
        }

        /**
         * 建立Http请求。获取bitmap
         * @param param
         * @return
         */
        private Bitmap downloadBitmap(String param) {
          Bitmap bitmap=null;
          HttpURLConnection con=null;
          try{
              URL url=new URL(imageUrl);
              con=(HttpURLConnection)url.openConnection();
              con.setConnectTimeout(5*1000);
              con.setReadTimeout(10*1000);
              bitmap= BitmapFactory.decodeStream(con.getInputStream());
          }catch (Exception e){
              e.printStackTrace();
          }finally {
              if(con!=null)
              con.disconnect();
          }
          return bitmap;
        }
    }
}
