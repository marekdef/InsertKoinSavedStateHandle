package pl.senordeveloper.insertkoinsavedstatehandle

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class DetailViewModel2(savedStateHandle: SavedStateHandle): ViewModel() {
    val message = savedStateHandle.getLiveData<String>("message")
}