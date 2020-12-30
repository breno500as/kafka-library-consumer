package com.kafka.library.consumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafka.library.consumer.service.LibraryEventsService;

@Component
public class LibraryEventsConsumer {
	@Autowired
	private LibraryEventsService libraryEventsService;

	@KafkaListener(topics = { "library-events" })
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {
		System.out.println("Mensagem consumida: "+ consumerRecord.value());
		libraryEventsService.processLibraryEvent(consumerRecord);
		

	}
}
