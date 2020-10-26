package com.springboot.model;

public class SharedProfileModel {
	
	private long jobId;
	private long profileId;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;

	public SharedProfileModel(long jobId, long profileId, String username, String firstName, String lastName,
			String email, String phone) {
		this.jobId = jobId;
		this.profileId = profileId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public final long getJobId() {
		return jobId;
	}

	public final long getProfileId() {
		return profileId;
	}

	public final String getUsername() {
		return username;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final String getEmail() {
		return email;
	}

	public final String getPhone() {
		return phone;
	}
	
}
