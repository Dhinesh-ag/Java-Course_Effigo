package com.in28minutes.springboot.myfirswebapp.todo.TODO;

import java.time.LocalDate;

public class Todo 
{
	public Todo(int id, String uName, String descript, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.uName = uName;
		this.descript = descript;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	public Todo() {
		super();
	}

	private int id;
	private String uName;
	private String descript;
	private LocalDate targetDate;
	private boolean done;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
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
		return "Todo [id=" + id + ", uName=" + uName + ", descript=" + descript + ", targetDate=" + targetDate
				+ ", done=" + done + "]";
	} 

}
