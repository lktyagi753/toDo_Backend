package com.assign.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.assign.entity.Task;
//import com.assign.service.TaskService;
import com.assign.repository.TaskRepo;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;

    // If using Lombok @AllArgsConstructor, you don't need the explicit constructor.

    @GetMapping("/task")
    public ResponseEntity<List<Task>> getTasks() {
    	List<Task> taskList = new ArrayList<>();
         taskRepo.findAll().forEach(taskList::add);
         return new ResponseEntity<List<Task>>(taskList,HttpStatus.OK);
    }

    @PostMapping("/add-task")
    public String addTask(@RequestBody Task task) {
        taskRepo.save(task);
        return "task added";
    }
    @GetMapping("/task/{taskId}")
    public ResponseEntity<Task> getTaskById(@PathVariable long taskId)
    {
    	Optional<Task> tasks = taskRepo.findById(taskId);
    	if(tasks.isPresent())
    	return new ResponseEntity<Task>(tasks.get(),HttpStatus.OK);
    	else
    		return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
    }
    
    @PutMapping("/task/{taskId}")
    public String updateTask(@PathVariable long  taskId , @RequestBody Task task)
    {
    	Optional<Task> tasks = taskRepo.findById(taskId);
    	if(tasks.isPresent())
    	{
    		Task t = tasks.get();
    		t.setId(task.getId());
    		t.setTitle(task.getTitle());
    		taskRepo.save(t);
    		return "Task updated";

    	}
    	else
    	{
    		return "Task not exists";
    	}

}
    @DeleteMapping("/task/{taskId}")
    public String deleteTask(@PathVariable Long taskId)
    {
    	taskRepo.deleteById(taskId);
    	return "task deleted";
    }
}