package com.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.ApplicationEntity;
import com.springboot.model.ApplicationModel;
import com.springboot.model.SharedProfileModel;
import com.springboot.repo.ApplicationRepository;
import com.springboot.util.ModelUtil;

@Service
public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	public ApplicationModel createApllication(SharedProfileModel profile) {
		ApplicationEntity savedApplication = applicationRepository.save(ModelUtil.parse(profile));
		return ModelUtil.parse(savedApplication);
	}

	@Override
	public List<ApplicationModel> getAllApplications() {
		List<ApplicationEntity> applications = applicationRepository.findAll();
		return applications.stream().map(ModelUtil::parse).collect(Collectors.toList());
	}

	@Override
	public Optional<ApplicationModel> getApplicationById(long id) {
		Optional<ApplicationEntity> application = applicationRepository.findById(id);
		
		if (!application.isPresent()) {
			return Optional.empty();
		}
		
		return Optional.of(ModelUtil.parse(application.get()));
	}
}
