package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.JobModel;

public interface JobService {

	JobModel createOrUpdateJob(JobModel job);
	
	Optional<JobModel> getJobById(long jobId);
	
	List<JobModel> getAllJobs();
}
