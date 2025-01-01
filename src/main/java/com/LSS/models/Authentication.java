package com.LSS.models;
import jakarta.persistence.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class Authentication {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Authentication_Sequence")
	@SequenceGenerator(name = "Authentication_Sequence", sequenceName = "Authentication_Sequence", allocationSize = 1)
	private Long AuthenticationID ;
	private String Authentication_name;
	public Authentication() {
		// TODO Auto-generated constructor stub
	}

}
