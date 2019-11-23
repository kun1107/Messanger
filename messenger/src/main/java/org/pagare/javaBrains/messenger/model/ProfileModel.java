package org.pagare.javaBrains.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProfileModel {
	private Integer pId;
	private String profileName;
	private String firstName;
	private String lastName;
	private Date created;
	public ProfileModel() {
		super();
	}
	public ProfileModel(Integer pId,String profileName, String firstName, String lastName) {
		super();
		this.pId = pId;
		this.profileName = profileName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
}
