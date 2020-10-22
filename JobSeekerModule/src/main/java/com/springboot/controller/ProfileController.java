package com.springboot.controller;

import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.ProfileModel;
import com.springboot.service.ProfileService;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	@Autowired
	private ProfileService profileService;
	
	@PostMapping
	public ResponseEntity<ProfileModel> createProfile(@Valid @RequestBody ProfileModel profile) {
		ProfileModel createdProfile = profileService.createOrUpdateProfile(profile);
		
		return ResponseEntity.ok(createdProfile);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProfileModel> updateProfile(
			@PathVariable long id,
			@Valid @RequestBody ProfileModel profile) {
		
		ProfileModel updatedProfile = profileService.createOrUpdateProfile(profile);
		
		return ResponseEntity.ok(updatedProfile);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProfileModel> getProfile(@PathVariable long id) {
		
		Optional<ProfileModel> profile = profileService.getProfileById(id);
		return ResponseEntity.of(profile);
	}
}
