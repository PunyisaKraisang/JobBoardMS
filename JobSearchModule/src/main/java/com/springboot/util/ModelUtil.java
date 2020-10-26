package com.springboot.util;

import com.springboot.entity.JobEntity;
import com.springboot.model.JobModel;

public class ModelUtil {

	private ModelUtil() {
		
	}
	
	public static JobEntity parse(JobModel from) {
		return new JobEntity(
				from.getJobId(), 
				from.getTitle(), 
				from.getDescription(), 
				from.getRequirement(), 
				from.getDepartment(), 
				from.getLocation());
				
	}
	
	public static JobModel parse(JobEntity from) {
		return new JobModel(
				from.getJobId(), 
				from.getTitle(), 
				from.getDescription(), 
				from.getRequirement(), 
				from.getDepartment(), 
				from.getLocation());
	}
}
