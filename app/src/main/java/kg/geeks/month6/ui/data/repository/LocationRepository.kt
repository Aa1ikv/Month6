package kg.geeks.month6.ui.data.repository

import kg.geeks.month6.ui.data.api.LocationApiService
import kg.geeks.month6.ui.data.dto.LocationsResponse

class LocationRepository(
    private val apiService: LocationApiService
) {

    suspend fun fetchAllLocations(): List<LocationsResponse>? {
        val response = apiService.fetchAllLocations()
        return if (response.isSuccessful) {
            response.body()?.locationsResponse
        } else {
            emptyList()
        }
    }
}