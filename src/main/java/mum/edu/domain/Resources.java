package mum.edu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resources {
	@Id @GeneratedValue
	private int resoucesId;
	
	@ManyToOne
	 Task tasks = new Task();

	public Task getTasks() {
		return tasks;
	}

	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}
	
	

}
