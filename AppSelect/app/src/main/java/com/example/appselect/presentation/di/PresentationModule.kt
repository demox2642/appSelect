package com.example.appselect.presentation.di

import com.example.appselect.presentation.ui.movielist.MovieListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {
    viewModel { MovieListViewModel() }
}
