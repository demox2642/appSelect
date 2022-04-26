package com.example.appselect.presentation.ui.movielist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.*
import com.example.data.repository.MovieRepository
import com.example.domain.models.Movie
import kotlinx.coroutines.flow.*

class MovieListViewModel : ViewModel() {

    fun getListData(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(pageSize = 20),
            pagingSourceFactory = { MovieRepository() }
        ).flow.cachedIn(viewModelScope)
    }
}
