package kg.geeks.month6.ui.data.repository
import kg.geeks.month6.ui.data.api.LocationApiService

class LocationRepository(private val locationApiService: LocationApiService) {

    suspend fun getLocations() = locationApiService.getLocations()

    suspend fun getLocationDetails(id: Int) = locationApiService.getLocationDetails(id)
}