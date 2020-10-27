package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class ApplicationEntity {

	@Id
	@Column(name = "application_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "application_id_seq")
	@SequenceGenerator(
			name = "application_id_seq",
			sequenceName = "application_id_seq",
			initialValue = 1000,
			allocationSize = 1
	)
	private long applicationId;
	
	@Column(name = "job_id")
	private long jobId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;

	public ApplicationEntity() {
	}
	
	public ApplicationEntity(long jobId, String username, String firstName, String lastName, String email, String phone) {
		this.jobId = jobId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public ApplicationEntity(long applicationId, long jobId, String username, String firstName, String lastName,
			String email, String phone) {
		this.applicationId = applicationId;
		this.jobId = jobId;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
