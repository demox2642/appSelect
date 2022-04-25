// Generated by view binder compiler. Do not edit!
package com.example.appselect.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.appselect.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMovieListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout frameLayout2;

  @NonNull
  public final RecyclerView moviesRecycler;

  private FragmentMovieListBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout frameLayout2, @NonNull RecyclerView moviesRecycler) {
    this.rootView = rootView;
    this.frameLayout2 = frameLayout2;
    this.moviesRecycler = moviesRecycler;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMovieListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMovieListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_movie_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMovieListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout frameLayout2 = (ConstraintLayout) rootView;

      id = R.id.movies_recycler;
      RecyclerView moviesRecycler = ViewBindings.findChildViewById(rootView, id);
      if (moviesRecycler == null) {
        break missingId;
      }

      return new FragmentMovieListBinding((ConstraintLayout) rootView, frameLayout2,
          moviesRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
