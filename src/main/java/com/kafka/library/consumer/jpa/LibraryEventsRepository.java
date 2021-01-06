package com.kafka.library.consumer.jpa;

import org.springframework.data.repository.CrudRepository;

import com.kafka.library.consumer.entity.LibraryEvent;

public interface LibraryEventsRepository  extends CrudRepository<LibraryEvent,Integer> {

}
