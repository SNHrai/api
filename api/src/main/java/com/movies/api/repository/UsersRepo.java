package com.movies.api.repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.api.model.User;

public interface UsersRepo extends JpaRepository<User, Integer> {
    
    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}
