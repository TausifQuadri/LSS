package com.LSS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table
@Entity
public class module {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Module_Sequence")
	@SequenceGenerator(name = "Module_Sequence", sequenceName = "Module_Sequence", allocationSize = 1)
	private Long moduleID ;
	private String Module_name;

	public module(String module_name) {
		super();
		Module_name = module_name;
	}

	@Override
	public String toString() {
		return "module [moduleID=" + moduleID + ", Module_name=" + Module_name + "]";
	}

	public String getModule_name() {
		return Module_name;
	}

	public void setModule_name(String module_name) {
		Module_name = module_name;
		
		
	}

	public module() {
		
	}

}
