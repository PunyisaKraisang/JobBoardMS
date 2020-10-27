package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.ApplicationModel;
import com.springboot.model.SharedProfileModel;

public interface ApplicationService {

	ApplicationModel createApllication(SharedProfileModel profile);
	
	List<ApplicationModel> getAllApplications();
	
	Optional<ApplicationModel> getApplicationById(long id);
}
