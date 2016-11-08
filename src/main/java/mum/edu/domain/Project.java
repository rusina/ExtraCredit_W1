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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Project {
	@Id
	@GeneratedValue
	private int projectId;
	private String name;
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	
	@Lob
	private byte picture;

	@OneToMany(mappedBy="projects")
	List<Beneficiaries> beneficiList = new ArrayList<Beneficiaries>();

	@OneToMany(mappedBy="project")
	List<Task> taskList = new ArrayList<Task>();

	@Enumerated(EnumType.STRING)
	private EnumStatus projStatus;
	

	public String getName() {
		return name;
	}
@OneToMany(mappedBy="project_role")
private List<UserRoles> roles = new ArrayList<UserRoles>();

	public byte getPicture() {
		return picture;
	}

	public void setPicture(byte picture) {
		this.picture = picture;
	}

	public EnumStatus getProjStatus() {
		return projStatus;
	}

	public void setProjStatus(EnumStatus projStatus) {
		this.projStatus = projStatus;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public List<Beneficiaries> getBeneficiList() {
		return beneficiList;
	}

	public void setBeneficiList(List<Beneficiaries> beneficiList) {
		this.beneficiList = beneficiList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
