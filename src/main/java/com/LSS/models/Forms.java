package com.LSS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class Forms {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Form_Sequence")
	@SequenceGenerator(name = "Form_Sequence", sequenceName = "Form_Sequence", allocationSize = 1)
	private Long FormID ;
	private String Form_name;
	private Long moduleID;
	public Forms() {
		// TODO Auto-generated constructor stub
	}
	public String getForm_name() {
		return Form_name;
	}
	public void setForm_name(String form_name) {
		Form_name = form_name;
	}
	public Long getModuleID() {
		return moduleID;
	}
	public void setModuleID(Long moduleID) {
		this.moduleID = moduleID;
	}
	@Override
	public String toString() {
		return "Forms [FormID=" + FormID + ", Form_name=" + Form_name + ", moduleID=" + moduleID + "]";
	}
	public Forms( String form_name, Long moduleID) {
		super();
		
		Form_name = form_name;
		this.moduleID = moduleID;
	}

}
