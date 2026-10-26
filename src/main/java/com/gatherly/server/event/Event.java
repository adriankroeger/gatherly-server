package com.gatherly.server.event;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

enum EventCategory {
  TECH
};

@Entity
class Event {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private String title;
  private String description;
  @Enumerated(EnumType.STRING)
  private EventCategory category;
  @Column(name = "starts_at")
  private Instant starstAt;
  @Column(name = "ends_at")
  private Instant endsAt;
  private int capacity;

  Event() {
  }

  Event(UUID id, String title, String description, EventCategory category, Instant startsAt, Instant endsAt,
      int capacity) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.category = category;
    this.starstAt = startsAt;
    this.endsAt = endsAt;
    this.capacity = capacity;
  }

  void setId(UUID id) {
    this.id = id;
  }

  UUID getId() {
    return id;
  }

  void setTitle(String title) {
    this.title = title;
  }

  String getTitle() {
    return title;
  }

  void setDescription(String description) {
    this.description = description;
  }

  String getDescription() {
    return description;
  }

  void setCategory(EventCategory category) {
    this.category = category;
  }

  EventCategory getCategory() {
    return category;
  }

  void setStarstAt(Instant starstAt) {
    this.starstAt = starstAt;
  }

  Instant getStarstAt() {
    return starstAt;
  }

  void setEndsAt(Instant endsAt) {
    this.endsAt = endsAt;
  }

  Instant getEndsAt() {
    return endsAt;
  }

  void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  int getCapacity() {
    return capacity;
  }

}
