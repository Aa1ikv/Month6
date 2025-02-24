package kg.geeks.month6.ui.app

import android.app.Application
import kg.geeks.month6.ui.data.serviceLocator.dataModule
import kg.geeks.month6.ui.module.appModule
import kg.geeks.month6.ui.module.uiModule
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(dataModule, uiModule, appModule)
        }
    }
}