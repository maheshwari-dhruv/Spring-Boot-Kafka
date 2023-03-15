package com.example.services;

import com.example.modals.Employee;

public interface KafkaConsumerService {

    void receive(Employee employee);
}
