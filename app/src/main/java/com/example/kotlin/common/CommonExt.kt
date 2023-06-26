package com.example.kotlin.common


import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.multiple.`interface`.Notification

import com.example.kotlin.multiple.impl.ViVoNotificationImpl


/**
 * Created by simon on 6/26/23 02:01
 *
 */

var isViVo=true

fun AppCompatActivity.notification(message:String){
      val notification: Notification
     if(isViVo){
         notification=ViVoNotificationImpl()
         notification.inform(message)
     }
}
