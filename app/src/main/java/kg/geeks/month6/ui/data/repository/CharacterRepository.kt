package kg.geeks.month6.ui.data.repository

import kg.geeks.month6.ui.data.api.CharacterApiService
import kg.geeks.month6.ui.data.dto.CharacterResponse
import kg.geeks.month6.ui.data.dto.CharacterResultResponse
import retrofit2.Response

class CharacterRepasitory (
    private val apiService: CharacterApiService
){
    suspend fun fetchCharacters(): Response<CharacterResultResponse> {
        return  apiService.fetchCharacters()
    }

    suspend fun getCharacterDetails(id: Int): Response<CharacterResponse> {
        return apiService.getCharacterById(id)
    }
}}
}