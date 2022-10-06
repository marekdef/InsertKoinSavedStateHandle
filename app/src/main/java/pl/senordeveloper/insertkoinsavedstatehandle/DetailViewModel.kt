package pl.senordeveloper.insertkoinsavedstatehandle

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DetailViewModel(savedStateHandle: SavedStateHandle): ViewModel() {
    val message = savedStateHandle.getLiveData("message", DetailFragmentArgs.fromSavedStateHandle(savedStateHandle).message)
}