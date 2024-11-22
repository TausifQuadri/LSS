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
public class Staff {
	private String staffName;
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Staff_Sequence")
@SequenceGenerator(name = "Staff_Sequence", sequenceName = "Staff_Sequence", allocationSize = 1)

	private Long staffId;
    private String Staff_email;
private String Address;

}
