package com.springboot.service;

import java.util.Optional;

import com.springboot.model.ProfileModel;

public interface ProfileService {

	ProfileModel createOrUpdateProfile(ProfileModel profile);
	
	Optional<ProfileModel> getProfileById(long profileId);
	
	Optional<ProfileModel> getProfileByUsername(String username);
}
