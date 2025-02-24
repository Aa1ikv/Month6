package kg.geeks.month6.ui.app.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class EpisodeViewModel(
    private val episodeRepository: EpisodeRepository
) : ViewModel() {

    fun fetchAllEpisodes() {
        viewModelScope.launch {
            val episodes = episodeRepository.fetchAllEpisodes()
            Log.e("EpisodeViewModel", "Fetched Episodes: $episodes")
        }
    }
}