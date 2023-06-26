package com.example.kotlin.multiple.impl

import com.example.kotlin.multiple.`interface`.Notification


/**
 * Created by simon on 6/26/23 02:05
 *
 */
class ViVoNotificationImpl:Notification{
    override fun inform(message: String) {
        //真正处理不同平台的 通知事件
    }
}