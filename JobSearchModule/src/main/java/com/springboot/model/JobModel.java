package com.springboot.model;

import javax.validation.constraints.Size;

public class JobModel {
	
	private long jobId;

	@Size(min = 3, max = 50)
	private String title;

	@Size(min = 3)
	private String description;

	@Size(min = 3)
	private String requirement;

	@Size(min = 3, max = 30)
	private String department;

	@Size(min = 3, max = 20)
	private String location;

	public JobModel() {
	}

	public JobModel(long jobId, String title, String description, String requirement, String department, String location) {
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
