package com.example.service;

import com.example.modals.Employee;

public interface KafkaProducerService {
    String sendMessage(Employee employee);
}
