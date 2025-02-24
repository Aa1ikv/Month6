package kg.geeks.month6.ui.data.dto

import com.google.gson.annotations.SerializedName

data class CharactersResultsResponse(
    @SerializedName("results")
    val charactersResponse: List<CharactersResponse>
)

data class CharactersResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location

)

data class Location(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)