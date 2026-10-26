package com.gatherly.server.event;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class EventService {

  private EventRepository eventRepository;
  private EventMapper eventMapper;

  public EventService(EventRepository eventRepository, EventMapper eventMapper) {
    this.eventRepository = eventRepository;
    this.eventMapper = eventMapper;
  }

  public EventDTO getEvent(UUID id) {
    return eventRepository.findById(id).map(eventMapper::toDto).orElse(null);
  }

  public List<EventDTO> getAllEvents() {
    return eventRepository.findAll()
      .stream()
      .map(eventMapper::toDto)
      .toList();
  }

}
