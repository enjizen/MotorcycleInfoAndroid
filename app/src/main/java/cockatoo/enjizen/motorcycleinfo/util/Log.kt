package cockatoo.enjizen.motorcycleinfo.util

import com.google.gson.Gson
import org.jetbrains.anko.*

/**
 * Created by wanchalermyuphasuk on 4/2/2018 AD.
 */
object Log: AnkoLogger {

    private const val isShow = true

    fun i(tag: String, msg: String){
            info { "$tag : $msg" }
    }

    fun i(tag: String, msg: Any){
        info { "$tag : ${Gson().toJson(msg)}" }
    }

    fun d(tag: String, msg: String){
            debug { "$tag : $msg" }
    }

    fun e(tag: String, msg: String){
            error { "$tag : $msg" }
    }

    fun v(tag: String, msg: String){
            verbose { "$tag : $msg"  }
    }
}