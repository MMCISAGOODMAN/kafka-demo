package org.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "first_topic", groupId = "first_group")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }
}

