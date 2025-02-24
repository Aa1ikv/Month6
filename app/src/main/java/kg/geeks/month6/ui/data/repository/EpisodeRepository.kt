package kg.geeks.month6.ui.data.repository

import kg.geeks.month6.ui.data.api.EpisodeApiService

class EpisodeRepository(private val episodeApiService: EpisodeApiService) {

    suspend fun getEpisodes() = episodeApiService.getEpisodes()

    suspend fun getEpisodeDetails(id: Int) = episodeApiService.getEpisodeDetails(id)
}