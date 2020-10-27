package com.springboot.model;

public class SharedProfileModel {
	
	private long jobId;
	private long profileId;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public SharedProfileModel() {
	}

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

	public final void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public final long getProfileId() {
		return profileId;
	}

	public final void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public final String getUsername() {
		return username;
	}

	public final void setUsername(String username) {
		this.username = username;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public final String getPhone() {
		return phone;
	}

	public final void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "SharedProfileModel [jobId=" + jobId + ", profileId=" + profileId + ", "
				+ (username != null ? "username=" + username + ", " : "")
				+ (firstName != null ? "firstName=" + firstName + ", " : "")
				+ (lastName != null ? "lastName=" + lastName + ", " : "")
				+ (email != null ? "email=" + email + ", " : "") + (phone != null ? "phone=" + phone : "") + "]";
	}
}
