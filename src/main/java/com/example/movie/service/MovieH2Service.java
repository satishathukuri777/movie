/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.http.HttpStatus;
 * import org.springframework.jdbc.core.JdbcTemplate;
 * import org.springframework.stereotype.Service;
 * import org.springframework.web.server.ResponseStatusException;
 * import java.util.*;
 *
 */

// Write your code here

package com.example.movie.service;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.movie.model.Movie;
import org.springframework.http.HttpStatus;
import com.example.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MovieH2Service {

    @Autowired
    private MovieRepository movieRepository;

    public ArrayList<Movie> getMovies() {
        return movieRepository.getMovies();
    }

    public Movie getMovieById(int movieId) {
        return movieRepository.getMovieById(movieId);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.addMovie(movie);
    }

    public Movie updateMovie(int movieId, Movie movie) {
        return movieRepository.updateMovie(movieId, movie);
    }

    public void deleteMovie(int movieId) {
        movieRepository.deleteMovie(movieId);
    }
}
