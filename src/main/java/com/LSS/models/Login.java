package com.LSS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Login {

    private String loginId;
    private String password;
    private Long authenticationId;
    private Long userID;

    public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Login_Sequence")
    @SequenceGenerator(name = "Login_Sequence", sequenceName = "Login_Sequence", allocationSize = 1)
    private Long id;

    

    public Login(String loginId, String password, Long authenticationId, Long userID, Long id) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.authenticationId = authenticationId;
		this.userID = userID;
		this.id = id;
	}

	public Login() {}

    @Override
    public String toString() {
        return "Login [loginId=" + loginId + ", password=" + password + ", authenticationId=" + authenticationId
                + ", id=" + id + "]";
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(Long authenticationId) {
        this.authenticationId = authenticationId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}