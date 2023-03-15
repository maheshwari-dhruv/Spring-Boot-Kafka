package com.example.modals;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kaustubh Dongare
 * @version $Id: Employee.java, v 0.1 2023-03-14 08:44 PM Kaustubh Dongare Exp $$
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private int age;
}
