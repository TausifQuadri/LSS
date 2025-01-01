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
public class Login {
private String LoginId;
private String Password;
private Long AuthenticationID;
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Login_Sequence")
@SequenceGenerator(name = "Login_Sequence", sequenceName = "Login_Sequence", allocationSize = 1)
private Long id ;
	public Login(String loginId, String password, Long authenticationID) {
	super();
	LoginId = loginId;
	Password = password;
	AuthenticationID = authenticationID;
	
}
	@Override
	public String toString() {
		return "Login [LoginId=" + LoginId + ", Password=" + Password + ", Authentication=" + AuthenticationID + ", id="
				+ id + "]";
	}
	public Login() {
		
	}
	public String getLoginId() {
		return LoginId;
	}
	public void setLoginId(String loginId) {
		LoginId = loginId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Long getAuthentication() {
		return AuthenticationID;
	}
	public void setAuthentication(Long authentication) {
		AuthenticationID = authentication;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
