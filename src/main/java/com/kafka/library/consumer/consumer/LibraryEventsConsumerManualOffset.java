package com.kafka.library.consumer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;


//@Component
public class LibraryEventsConsumerManualOffset implements AcknowledgingMessageListener<Integer,String> {


    @Override
    //@KafkaListener(topics = {"library-events"})
    public void onMessage(ConsumerRecord<Integer, String> consumerRecord, Acknowledgment acknowledgment) {
        acknowledgment.acknowledge();
    }
}
