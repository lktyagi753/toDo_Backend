package com.assign.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Task(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Task() {
		super();
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title +  "]";
	}
	

}
