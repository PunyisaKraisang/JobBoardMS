package com.springboot.util;

import com.springboot.entity.ProfileEntity;
import com.springboot.model.ProfileModel;

public class ModelUtil {

	private ModelUtil() {
		
	}
	
	public static ProfileEntity parse(ProfileModel from) {
		return new ProfileEntity(
				from.getProfileId(), 
				from.getUsername(),
				from.getFirstName(), 
				from.getLastName(), 
				from.getEmail(), 
				from.getPhone());
	}
	
	public static ProfileModel parse(ProfileEntity from) {
		return new ProfileModel(
				from.getProfileId(), 
				from.getUsername(),
				from.getFirstName(), 
				from.getLastName(), 
				from.getEmail(), 
				from.getPhone());
	}
}
