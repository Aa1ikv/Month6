package kg.geeks.month6.ui.data.api

import kg.geeks.month6.ui.data.dto.CharacterResultResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterApiService {

    @GET("character")
    suspend fun fetchCharacters(): Response<CharacterResultResponse>

    @GET("character/{id}")
    suspend fun getCharacterById(@Path("id") id: Int): Response<CharacterResponse>
}