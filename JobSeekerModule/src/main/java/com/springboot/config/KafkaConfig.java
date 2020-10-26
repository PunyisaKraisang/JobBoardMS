package com.springboot.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.springboot.model.SharedProfileModel;

@Configuration
@EnableKafka
public class KafkaConfig {
	
	@Value("${kafka.bootstrap.servers}")
	private String bootstrapServers;
	
	@Bean
	public ProducerFactory<String, SharedProfileModel> producerFactory(){
		
		Map<String, Object> configs = new HashMap<>();
		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new DefaultKafkaProducerFactory<>(configs);
	}
	
	@Bean
	public KafkaTemplate<String, SharedProfileModel> kafkaTemplate(){
		return new KafkaTemplate<>(producerFactory());
	}

}
