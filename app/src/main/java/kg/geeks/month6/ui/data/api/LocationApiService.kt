package kg.geeks.month6.ui.data.api

import retrofit2.Response
import retrofit2.http.GET

interface LocationApiService {

    @GET("api/location")
    suspend fun fetchAllLocations(): Response<LocationsResultsResponse>
}