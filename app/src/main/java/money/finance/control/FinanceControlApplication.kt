package money.finance.control

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class FinanceControlApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        if (BuildConfig.DEBUG) {
//            Timber.plant(Timber.DebugTree())
//        }
    }
}
