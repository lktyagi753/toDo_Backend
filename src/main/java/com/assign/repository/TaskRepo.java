package com.assign.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assign.entity.Task;

public interface TaskRepo extends JpaRepository<Task,Long>{
	
}
