package org.example.controller;

import jakarta.annotation.Resource;
import org.example.producer.KafkaProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Resource
    private KafkaProducer kafkaProducer;
    @GetMapping("/sendMsg/{msg}")
    public void sendMsg(@PathVariable("msg") final String msg){
        kafkaProducer.sendMessage(msg);
    }
}
