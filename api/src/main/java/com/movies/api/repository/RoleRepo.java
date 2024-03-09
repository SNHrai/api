package com.movies.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.api.model.Roles;

public interface RoleRepo extends JpaRepository<Roles, Integer> {
    
}
