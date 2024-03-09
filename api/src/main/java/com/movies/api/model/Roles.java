package com.movies.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Setter
@Getter
public class Roles {
    
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = jakarta.persistence.EnumType.STRING)
    @Column(name = "role", length = 20)
    private ERoles role;

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User users;

    public Roles() {}

    public Roles(ERoles role) {
        this.role = role;
    }

}
