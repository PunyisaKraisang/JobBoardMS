package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class ProfileEntity {
	
	@Id
	@Column(name = "profile_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_id_seq")
	@SequenceGenerator(
			name = "profile_id_seq",
			sequenceName = "profile_id_seq",
			initialValue = 1000,
			allocationSize = 1
	)
	private long profileId;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;
	
	public ProfileEntity() {
	}

	public ProfileEntity(long profileId, String firstName, String lastName, String email, String phone) {
		this.profileId = profileId;
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
