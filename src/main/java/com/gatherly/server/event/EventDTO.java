package com.gatherly.server.event;

import java.time.Instant;
import java.util.UUID;

public record EventDTO(
  UUID id,
  String title,
  String description,
  EventCategory category,
  Instant startsAt,
  Instant endsAt,
  int capacity
) {};
