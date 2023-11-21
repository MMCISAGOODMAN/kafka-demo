package org.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "first_topic", groupId = "first_group")
    public void firstConsume(String message) {
        System.out.println("First consumed message: " + message);
    }

    @KafkaListener(topics = "first_topic", groupId = "second_group")
    public void secondConsume(String message) {
        System.out.println("Second consumed message: " + message);
    }
}

