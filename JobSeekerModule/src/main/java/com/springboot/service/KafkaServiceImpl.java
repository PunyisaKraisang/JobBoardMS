package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.springboot.model.ProfileModel;
import com.springboot.model.SharedProfileModel;

@Service
public class KafkaServiceImpl implements KafkaService {
	
	@Value("${kafka.profile.topic}")
	private String topic;

	@Autowired
	private KafkaTemplate<String, SharedProfileModel> kafkaTemplate;
	
	@Override
	public void sendMessage(long jobId, ProfileModel profile) {
		
		SharedProfileModel sharedProfile = new SharedProfileModel(
				jobId, 
				profile.getProfileId(), 
				profile.getUsername(), 
				profile.getFirstName(), 
				profile.getLastName(), 
				profile.getEmail(), 
				profile.getPhone());
		
		kafkaTemplate.send(topic, sharedProfile);
	}
}
