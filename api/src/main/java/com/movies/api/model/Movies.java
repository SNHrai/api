package com.movies.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "movies_details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movies {

  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "image")
  private byte[] image;

  @Column(name = "name", length = 256)
  private String name;

  @Column(name = "rating")
  private int rating;

  @Column(name = "release_date")
  private java.sql.Date releaseDate;

  @Column(name = "duration")
  private int duration;

  @Column(name = "description", length = 256)
  private String description;
}
