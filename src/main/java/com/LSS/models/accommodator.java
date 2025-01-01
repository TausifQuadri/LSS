package com.LSS.models;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class accommodator {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Accommodator_Sequence")
	@SequenceGenerator(name = "Accommodator_Sequence", sequenceName = "Accommodator_Sequence", allocationSize = 1)
	
	private Long accommodatorID;
	private String accommodatorName;
	private String Gender;
	private String accommodatorFname;
	private String accommodatorMail;
	private String accommodatorProfession;
	private String accommodatorPhoneNumber;
	private String acccommodatorAdhaarNumber;
	private LocalDateTime DOB;
	
	
	public accommodator(Long accommodatorID,String accommodatorName, String gender, String accommodatorFname, String accommodatorMail,
			String accommodatorProfession, String accommodatorPhoneNumber, Long accomodatorID) {
		super();
		this.accommodatorID = accomodatorID;
		this.accommodatorName = accommodatorName;
		Gender = gender;
		this.accommodatorFname = accommodatorFname;
		this.accommodatorMail = accommodatorMail;
		this.accommodatorProfession = accommodatorProfession;
		this.accommodatorPhoneNumber = accommodatorPhoneNumber;
	}
	public Long getAccommodatorID() {
		return accommodatorID;
	}
	public void setAccommodatorID(Long accommodatorID) {
		this.accommodatorID = accommodatorID;
	}
	public String getAccommodatorName() {
		return accommodatorName;
	}
	public void setAccommodatorName(String accommodatorName) {
		this.accommodatorName = accommodatorName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAccommodatorFname() {
		return accommodatorFname;
	}
	public void setAccommodatorFname(String accommodatorFname) {
		this.accommodatorFname = accommodatorFname;
	}
	public String getAccommodatorMail() {
		return accommodatorMail;
	}
	public void setAccommodatorMail(String accommodatorMail) {
		this.accommodatorMail = accommodatorMail;
	}
	public String getAccommodatorProfession() {
		return accommodatorProfession;
	}
	public void setAccommodatorProfession(String accommodatorProfession) {
		this.accommodatorProfession = accommodatorProfession;
	}
	public String getAccommodatorPhoneNumber() {
		return accommodatorPhoneNumber;
	}
	public void setAccommodatorPhoneNumber(String accommodatorPhoneNumber) {
		this.accommodatorPhoneNumber = accommodatorPhoneNumber;
	}

}
