package com.main.sealedclasss


/**
 * Created by simon on 6/25/23 21:18
 *
 */
sealed class PlayerCmd{
   class Player(val url:String,val position:Int):PlayerCmd()

   class Seek(val position: Int):PlayerCmd()

    object Pause:PlayerCmd()

    object Stop:PlayerCmd()

    object Resume:PlayerCmd()

}
