package mum.edu.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Beneficiaries {
	
@Id @GeneratedValue
private int BeneId;
@ManyToOne
private Project projects;



public Project getProjects() {
	return projects;
}

public void setProjects(Project projects) {
	this.projects = projects;
}

public int getBeneId() {
	return BeneId;
}

public void setBeniId(int beneId) {
	BeneId = beneId;
}


}
