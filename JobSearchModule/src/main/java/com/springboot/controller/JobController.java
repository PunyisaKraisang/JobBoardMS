package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.JobModel;
import com.springboot.service.JobService;


@RestController
@RequestMapping("/jobs")
public class JobController {

	@Autowired
	private JobService jobService;
	
	@PostMapping
	public ResponseEntity<JobModel> createProfile(@Valid @RequestBody JobModel job) {
		
		JobModel createdJob = jobService.createOrUpdateJob(job);
		return ResponseEntity.ok(createdJob);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<JobModel> updateProfile(
			@PathVariable long id,
			@Valid @RequestBody JobModel job) {
		
		JobModel updatedJob = jobService.createOrUpdateJob(job);
		return ResponseEntity.ok(updatedJob);
	}
	
	@GetMapping
	public ResponseEntity<List<JobModel>> getAllJobs() {
		
		List<JobModel> jobs = jobService.getAllJobs();
		return ResponseEntity.ok(jobs);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<JobModel> getJobById(@PathVariable long id) {
		
		Optional<JobModel> profile = jobService.getJobById(id);
		return ResponseEntity.of(profile);
	}
}
