package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class JobEntity {
	
	@Id
	@Column(name = "job_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "job_id_seq")
	@SequenceGenerator(
			name = "job_id_seq",
			sequenceName = "job_id_seq",
			initialValue = 1000,
			allocationSize = 1
	)
	private long jobId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description", length = 2000)
	private String description;

	@Column(name = "requirement", length = 2000)
	private String requirement;
	
	@Column(name = "department")
	private String department; // TODO: as department code
	
	@Column(name = "location")
	private String location; // TODO: as location code

	public JobEntity() {
	}

	public JobEntity(long jobId, String title, String description, String requirement, String department,
			String location) {
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.requirement = requirement;
		this.department = department;
		this.location = location;
	}

	public final long getJobId() {
		return jobId;
	}

	public final void setJobId(long jobId) {
		this.jobId = jobId;
	}

	public final String getTitle() {
		return title;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final String getRequirement() {
		return requirement;
	}

	public final void setRequirement(String requirement) {
		this.requirement = requirement;
	}

	public final String getDepartment() {
		return department;
	}

	public final void setDepartment(String department) {
		this.department = department;
	}

	public final String getLocation() {
		return location;
	}

	public final void setLocation(String location) {
		this.location = location;
	}
	
	
}
