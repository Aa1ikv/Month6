package kg.geeks.month6.ui.serviceLocator

import kg.geeks.month6.ui.app.viewModel.CharactersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { CharactersViewModel(get()) }
}