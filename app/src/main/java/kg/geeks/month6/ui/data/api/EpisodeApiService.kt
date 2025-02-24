package kg.geeks.month6.ui.data.api

import okhttp3.Response
import retrofit2.http.GET

interface EpisodeApiService {

    @GET("api/episode")
    suspend fun fetchAllEpisodes(): Response<EpisodesResultsResponse>
}