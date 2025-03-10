package kg.geeks.month6.ui.module

import kg.geeks.month6.ui.viewModule.CharacterViewModule
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { CharacterViewModule(get()) }
}