package kg.geeks.month6.ui.data.api

import okhttp3.Response
import retrofit2.http.GET


interface CharacterApiService {

    @GET("api/character")
    suspend fun feetchAllCharacters(): Response<CharactersResultsResponse>
}