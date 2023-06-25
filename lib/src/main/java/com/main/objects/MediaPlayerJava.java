package com.main.objects;

/**
 * Created by simon on 6/25/23 20:48
 */
public class MediaPlayerJava {
    public static MediaPlayerJava INSTANCE=new MediaPlayerJava();
    private MediaPlayerJava(){}


    public static void main(String[] args) {
        MediaPlayer.INSTANCE.getStatue();

    }
}


