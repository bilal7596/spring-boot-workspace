package com.bilal.workspace.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "test-topic";

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, List.of("bilal", "basha"));
        System.out.println("Sent message: " + message);
    }
}
