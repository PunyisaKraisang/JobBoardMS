package com.springboot.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.model.SharedProfileModel;
import com.springboot.service.ApplicationService;


@Service
public class ApplicationListener {
	
	@Autowired
	private ApplicationService applicationService;
	
	@KafkaListener(topics = "seeker-profile-topic", groupId = "profile-consumer")
	public void consume(SharedProfileModel profile) {
		
		applicationService.createApllication(profile);
	}
}
