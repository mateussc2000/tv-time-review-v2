package com.java.tvtime.service;

import java.util.List;
import java.util.Optional;

import com.java.tvtime.model.Movie;

public interface MovieService {

    public List<Movie> allMovies();

    public Optional<Movie> singleMovie(String imdbId); 
}
