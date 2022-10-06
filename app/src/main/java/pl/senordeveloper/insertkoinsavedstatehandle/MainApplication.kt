package pl.senordeveloper.insertkoinsavedstatehandle

import android.app.Application
import android.os.Build
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import pl.senordeveloper.insertkoinsavedstatehandle.koin.appModule

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(level = if (BuildConfig.DEBUG) Level.DEBUG else Level.INFO)
            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}