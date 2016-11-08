package mum.edu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int taskId;

	@Enumerated(EnumType.STRING)
	private EnumStatus status;

	@OneToMany(mappedBy="tasks")
	private List<Resources> resourcesList = new ArrayList<Resources>();
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date task_startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date task_endDate;
	
	@ManyToOne
	private Project project;

	public Date getTask_startDate() {
		return task_startDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setTask_startDate(Date task_startDate) {
		this.task_startDate = task_startDate;
	}

	public Date getTask_endDate() {
		return task_endDate;
	}

	public void setTask_endDate(Date task_endDate) {
		this.task_endDate = task_endDate;
	}

	public List<Resources> getResourcesList() {
		return resourcesList;
	}

	public void setResourcesList(List<Resources> resourcesList) {
		this.resourcesList = resourcesList;
	}

	public EnumStatus getStatus() {
		return status;
	}

	public void setStatus(EnumStatus status) {
		this.status = status;
	}

}
