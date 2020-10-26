package com.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.JobEntity;
import com.springboot.model.JobModel;
import com.springboot.repo.JobRepository;
import com.springboot.util.ModelUtil;

@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobRepository jobRepository;
	
	public JobModel createOrUpdateJob(JobModel job) {
		JobEntity savedJob = jobRepository.save(ModelUtil.parse(job));
		return ModelUtil.parse(savedJob);
	}
	
	public Optional<JobModel> getJobById(long jobId) {
		Optional<JobEntity> job = jobRepository.findById(jobId);
		
		if (!job.isPresent()) {
			return Optional.empty();
		}
		
		return Optional.of(ModelUtil.parse(job.get()));
	}
	
	public List<JobModel> getAllJobs() {
		List<JobEntity> jobs = jobRepository.findAll();
		return jobs.stream().map(ModelUtil::parse).collect(Collectors.toList());
	}
}
