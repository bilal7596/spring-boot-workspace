package com.bilal.workspace.controller;

import com.bilal.workspace.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestKafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/kafka")
    public String kafka() {
        kafkaProducer.sendMessage("This message is from kafka");
        return "Success";
    }

}
