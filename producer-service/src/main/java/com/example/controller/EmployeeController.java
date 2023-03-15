package com.example.controller;

import com.example.modals.Employee;
import com.example.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kaustubh Dongare
 * @version $Id: EmployeeController.java, v 0.1 2023-03-14 11:41 PM Kaustubh Dongare Exp $$
 */
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        return kafkaProducerService.sendMessage(employee);
    }
}
