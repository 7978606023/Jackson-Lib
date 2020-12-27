package usingjsonproperty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private int id;
	@JsonProperty("first_Name")
	private String firstName;
	@JsonProperty("last-Name")
	private String lastName;
	@JsonProperty("ful_Name")
	private String fullName;
	public User(int id, String firstName, String lastName, String fullName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
