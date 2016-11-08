package mum.edu.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserRoles {

	@Id @GeneratedValue
	private int roleId;
	
	@ManyToOne
	private Project project_role;
	
	@Enumerated(EnumType.STRING)
	private EnumRoles roles;

	public EnumRoles getRoles() {
		return roles;
	}

	public void setRoles(EnumRoles roles) {
		this.roles = roles;
	}
	
}
