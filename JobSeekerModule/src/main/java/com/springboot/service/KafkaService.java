package com.springboot.service;

import com.springboot.model.ProfileModel;

public interface KafkaService {
;
	void sendMessage(long jobId, ProfileModel profile);
}
