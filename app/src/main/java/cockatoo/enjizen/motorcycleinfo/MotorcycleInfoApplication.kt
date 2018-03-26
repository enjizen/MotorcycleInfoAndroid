package cockatoo.enjizen.motorcycleinfo

import android.app.Application
import cockatoo.enjizen.motorcycleinfo.manager.Contextor

/**
 * Created by wanchalermyuphasuk on 25/3/2018 AD.
 */
class MotorcycleInfoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Contextor.init(applicationContext)
    }

    override fun onTerminate() {
        super.onTerminate()
    }
}