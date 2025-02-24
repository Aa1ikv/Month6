package kg.geeks.month6.ui.app.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class LocationViewModel(
    private val locationRepository: LocationRepository
) : ViewModel() {

    fun fetchAllLocations() {
        viewModelScope.launch {
            val locations = locationRepository.fetchAllLocations()
            Log.e("LocationViewModel", "Fetched Locations: $locations")
        }
    }
}