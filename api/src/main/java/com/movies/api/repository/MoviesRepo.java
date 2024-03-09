package com.movies.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.api.model.Movies;

public interface MoviesRepo extends JpaRepository<Movies, Integer> {
    
}
