package com.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.ProfileModel;
import com.springboot.service.KafkaService;
import com.springboot.service.ProfileService;

@RestController
public class ApplicationController {

	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/apply/{jobId}")
	public ResponseEntity<?> applyForJob(@PathVariable long jobId, @RequestHeader("Authorization") String username) { // TODO: read as JWT 
		
		// Get profile by current username
		Optional<ProfileModel> profile = profileService.getProfileByUsername(username);
		
		if (!profile.isPresent()) {
			// Return not found
			return ResponseEntity.of(profile);
		}
		
		// Share profile with application module
		kafkaService.sendMessage(jobId, profile.get());
		
		return ResponseEntity.ok().build();
	}
}
