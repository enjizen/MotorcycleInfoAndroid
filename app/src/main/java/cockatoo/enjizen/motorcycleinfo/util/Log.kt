package cockatoo.enjizen.motorcycleinfo.util

import org.jetbrains.anko.*

/**
 * Created by wanchalermyuphasuk on 4/2/2018 AD.
 */
object Log: AnkoLogger {

    private const val isShow = true

    fun i(tag: String, msg: String){
        if(isShow) {
            info { "$tag : $msg" }
        }
    }

    fun d(tag: String, msg: String){
        if(isShow){
            debug { "$tag : $msg" }
        }
    }

    fun e(tag: String, msg: String){
        if(isShow){
            error { "$tag : $msg" }
        }
    }

    fun v(tag: String, msg: String){
        if(isShow){
            verbose { "$tag : $msg"  }
        }
    }
}