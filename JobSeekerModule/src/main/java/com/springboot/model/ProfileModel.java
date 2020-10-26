package com.springboot.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProfileModel {
	
	private long profileId;
	
	@Size(min = 3, max = 15)
	@Pattern(regexp = "[A-Za-z0-9_]+")
	private String username;
	
	@Size(min = 3, max = 15)
	private String firstName;

	@Size(min = 3, max = 15)
	private String lastName;
	
	@Email
	private String email;
	
	@Size(min = 10, max = 18)
	private String phone;
	
	public ProfileModel() {
	}

	public ProfileModel(long profileId, String username, String firstName, String lastName, String email, String phone) {
		this.profileId = profileId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
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
	
	// TODO: address, educations, work experiences

}
