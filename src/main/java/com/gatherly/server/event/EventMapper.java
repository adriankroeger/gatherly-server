package com.gatherly.server.event;

import org.springframework.stereotype.Component;

@Component
class EventMapper {

  EventDTO toDto(Event entity) {
    return new EventDTO(
      entity.getId(),
      entity.getTitle(),
      entity.getDescription(),
      entity.getCategory(),
      entity.getStarstAt(),
      entity.getEndsAt(),
      entity.getCapacity()
    );
  }

  Event toEntitiy(EventDTO dto) {
    return new Event(
      dto.id(),
      dto.title(),
      dto.description(),
      dto.category(),
      dto.startsAt(),
      dto.endsAt(),
      dto.capacity()
    );
  }
}
