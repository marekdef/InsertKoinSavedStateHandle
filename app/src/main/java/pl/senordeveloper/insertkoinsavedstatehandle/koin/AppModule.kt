package pl.senordeveloper.insertkoinsavedstatehandle.koin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import pl.senordeveloper.insertkoinsavedstatehandle.DetailViewModel

val appModule = module {
    viewModel {
        DetailViewModel(savedStateHandle = get())
    }
}