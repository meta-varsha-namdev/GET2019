package com.metacube.training.model;

public class Employee {
	private Long _id;
	private String first_name;
	private String last_name;
	private String _email;
	private String contact;
	
    public Employee() {
	}

	public Employee(Long _id, String first_name, String last_name, String _email , String contact) {
		super();
		this._id = _id;
		this.first_name = first_name;
		this.last_name = last_name;
		this._email = _email;
		this.contact = contact;
		
	}

	public Long getId() {
		return _id;
	}

	public void setId(Long _id) {
		this._id = _id;
	}

	public String getfirstName() {
		return first_name;
	}

	public void setfirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getlastName() {
		return last_name;
	}

	public void setlastName(String lastName) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return _email;
	}

	public void setEmail(String _email) {
		this._email = _email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + _id + ", firstName=" + first_name + ", lastName=" + last_name + ", email=" + _email + ", contact=" + contact+"]";
	}
	
	

}