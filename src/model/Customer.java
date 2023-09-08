package model;

import java.sql.Date;

public class Customer {
	private int id;
	private String fullName;
	private Date birthday;
	private String address;
	
	public Customer() {
		super();
	}

	public Customer(int id, String fullName, Date birthday, String address) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
