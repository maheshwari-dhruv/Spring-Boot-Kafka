package com.example.service.impl;

import com.example.modals.Employee;
import com.example.service.KafkaProducerService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class KafkaProducerServiceImpl implements KafkaProducerService {

    @Autowired
    private NewTopic topic;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public String sendMessage(Employee employee) {
        log.info("Employee Data - {}", employee.toString());

        // Creating Message
        Message<Employee> message = MessageBuilder
                .withPayload(employee)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();

        kafkaTemplate.send(message);
        return "Success";
    }
}
