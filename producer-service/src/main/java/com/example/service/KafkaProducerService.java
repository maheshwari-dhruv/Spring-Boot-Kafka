package com.example.service;

import com.example.modals.Employee;

/**
 * @author Kaustubh Dongare
 * @version $Id: KafkaProducerService.java, v 0.1 2023-03-14 08:41 PM Kaustubh Dongare Exp $$
 */
public interface KafkaProducerService {
    String sendMessage(Employee employee);
}
