package com.springboot.util;

import com.springboot.entity.ApplicationEntity;
import com.springboot.model.ApplicationModel;
import com.springboot.model.SharedProfileModel;

public class ModelUtil {

	private ModelUtil() {
		
	}
	
	public static ApplicationEntity parse(SharedProfileModel from) {
		return new ApplicationEntity(
				from.getJobId(), 
				from.getUsername(), 
				from.getFirstName(), 
				from.getLastName(), 
				from.getEmail(), 
				from.getPhone());
				
	}
	
	public static ApplicationModel parse(ApplicationEntity from) {
		return new ApplicationModel(
				from.getApplicationId(),
				from.getJobId(), 
				from.getUsername(), 
				from.getFirstName(), 
				from.getLastName(), 
				from.getEmail(), 
				from.getPhone());
	}
}
