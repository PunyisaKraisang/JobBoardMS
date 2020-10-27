package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.ApplicationModel;
import com.springboot.service.ApplicationService;


@RestController
@RequestMapping("/applications")
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping
	public ResponseEntity<List<ApplicationModel>> getAllApplications() {
		
		List<ApplicationModel> applications = applicationService.getAllApplications();
		return ResponseEntity.ok(applications);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ApplicationModel> getApplicationById(@PathVariable long id) {
		
		Optional<ApplicationModel> profile = applicationService.getApplicationById(id);
		return ResponseEntity.of(profile);
	}
}
