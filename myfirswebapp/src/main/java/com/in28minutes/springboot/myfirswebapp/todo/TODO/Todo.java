package com.in28minutes.springboot.myfirswebapp.todo.TODO;

import java.time.LocalDate;

public class Todo 
{
	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	public Todo() {
		super();
	}

	private int id;
	private String username;
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return username;
	}
	public void setuName(String uName) {
		this.username = uName;
	}
	public String getDescript() {
		return description;
	}
	public void setDescript(String descript) {
		this.description = descript;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", uName=" + username + ", descript=" + description + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	} 

}
