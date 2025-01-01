package com.LSS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table
public class Authorization {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Authorization_Sequence")
	@SequenceGenerator(name = "Authorization_Sequence", sequenceName = "Authorization_Sequence", allocationSize = 1)
	private  Long AuthorizationID ;
	private  Long AuthenticationID;
	private  Long formId;
	private  Boolean EditRole;
	private  Boolean DeleteRole;
	private  Boolean ViewRole;

	@Override
	public String toString() {
		return "Authorization [AuthorizationID=" + AuthorizationID + ", AuthenticationID=" + AuthenticationID
				+ ", formId=" + formId + ", EditRole=" + EditRole + ", DeleteRole=" + DeleteRole + ", ViewRole="
				+ ViewRole + "]";
	}

	public Authorization(Long authenticationID, Long formId, Boolean editRole, Boolean deleteRole, Boolean viewRole) {
		super();
		AuthenticationID = authenticationID;
		this.formId = formId;
		EditRole = editRole;
		DeleteRole = deleteRole;
		ViewRole = viewRole;
	}

	public Long getAuthenticationID() {
		return AuthenticationID;
	}

	public void setAuthenticationID(Long authenticationID) {
		AuthenticationID = authenticationID;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
	}

	public Boolean getEditRole() {
		return EditRole;
	}

	public void setEditRole(Boolean editRole) {
		EditRole = editRole;
	}

	public Boolean getDeleteRole() {
		return DeleteRole;
	}

	public void setDeleteRole(Boolean deleteRole) {
		DeleteRole = deleteRole;
	}

	public Boolean getViewRole() {
		return ViewRole;
	}

	public void setViewRole(Boolean viewRole) {
		ViewRole = viewRole;
	}

	public Authorization() {
		
	}

}
