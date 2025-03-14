package kg.geeks.month6.ui.app.episode

import com.google.gson.annotations.SerializedName

data class EpisodeResponse(
    val results: List<Episode>
)

data class Episode(
    val id: Int,
    val name: String,
    @SerializedName("air_date")
    val airDate: String,
    val episode: String,
    val characters: List<String>
)