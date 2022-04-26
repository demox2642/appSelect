package com.example.appselect.presentation.ui.movielist

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appselect.databinding.FragmentMovieListBinding
import com.example.appselect.presentation.ui.plugins.ViewBindingFragment
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MovieListFragment : ViewBindingFragment<FragmentMovieListBinding>(FragmentMovieListBinding::inflate) {

    private val viewModel: MovieListViewModel by sharedViewModel()

    private var movieAdapter: MovieListAdapter ? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getListData()

        initList()
        initViewModel()
    }

    private fun initList() {
        movieAdapter = MovieListAdapter()

        with(binding.moviesRecycler) {
            adapter = movieAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }

    private fun initViewModel() {
        lifecycleScope.launchWhenCreated {
            viewModel.getListData().collectLatest {
                movieAdapter!!.submitData(it)
            }
        }
    }
}
