package com.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.ProfileEntity;
import com.springboot.model.ProfileModel;
import com.springboot.repo.ProfileRepository;
import com.springboot.util.ModelUtil;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public ProfileModel createOrUpdateProfile(ProfileModel profile) {
		ProfileEntity savedProfile = profileRepository.save(ModelUtil.parse(profile));
		return ModelUtil.parse(savedProfile);
	}

	@Override
	public Optional<ProfileModel> getProfileById(long profileId) {
		Optional<ProfileEntity> profile = profileRepository.findById(profileId);
		
		if (!profile.isPresent()) {
			return Optional.empty();
		}
		
		return Optional.of(ModelUtil.parse(profile.get()));
	}

	@Override
	public Optional<ProfileModel> getProfileByUsername(String username) {
		Optional<ProfileEntity> profile = profileRepository.findByUsername(username);
		
		if (!profile.isPresent()) {
			return Optional.empty();
		}
		
		return Optional.of(ModelUtil.parse(profile.get()));
	}
}
