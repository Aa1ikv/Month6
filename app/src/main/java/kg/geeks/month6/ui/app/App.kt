package kg.geeks.month6.ui.app

import android.app.Application

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(dataModul, uiModule)
        }
    }
}