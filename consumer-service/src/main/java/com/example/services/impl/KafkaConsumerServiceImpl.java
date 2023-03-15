package com.example.services.impl;

import com.example.modals.Employee;
import com.example.services.KafkaConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    @KafkaListener(topics = "${app.kafka.consumer.topic}", groupId = "${spring.kafka.consumer.group-id}")
    @Override
    public void receive(Employee employee) {
        log.info("Employee Data Received - {}", employee);
    }
}
