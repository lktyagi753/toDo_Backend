//package com.assign.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.assign.entity.Task;
//import com.assign.repository.TaskRepo;
//
//
//import lombok.AllArgsConstructor;
//
//
//
//@Service
//@AllArgsConstructor
//public class TaskService {
//	private TaskRepo taskRepo;
//	
//	  public TaskService(TaskRepo taskRepo) {
//	        this.taskRepo = taskRepo;
//	    }
//	public List<Task> getTask()
//	{
//		return taskRepo.findAll();
//	}
//
//	public Task save(Task task) {
//		
//		return taskRepo.save(task);
//	}
//
//}
