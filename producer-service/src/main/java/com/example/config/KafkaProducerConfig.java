package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kaustubh Dongare
 * @version $Id: KafkaProducerConfig.java, v 0.1 2023-03-14 08:33 PM Kaustubh Dongare Exp $$
 */
@Configuration
public class KafkaProducerConfig {

    @Value("${app.kafka.producer.topic}")
    private String topicName;

    @Autowired
    private ProducerFactory<Integer, String> producerFactory;

    public Map<String, Object> producerConfig() {
        return new HashMap<>(producerFactory.getConfigurationProperties());
    }

    @Bean
    public KafkaTemplate<String, Object> kafkaTemplate() {
        return new KafkaTemplate<>(new DefaultKafkaProducerFactory<>(producerConfig()));
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder
                .name(topicName)
                .build();
    }
}
