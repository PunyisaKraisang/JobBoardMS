package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.JobEntity;

@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {

}
