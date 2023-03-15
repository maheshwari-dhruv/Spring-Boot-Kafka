package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Kaustubh Dongare
 * @version \$Id: ${NAME}.java, v 0.1 ${YEAR}-${MONTH}-${DAY} ${TIME} Kaustubh Dongare Exp $$
 */
@SpringBootApplication
public class KafkaConsumerMain {
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerMain.class, args);
    }
}