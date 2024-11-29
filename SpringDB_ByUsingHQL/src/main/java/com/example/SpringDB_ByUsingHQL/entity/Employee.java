package com.example.SpringDB_ByUsingHQL.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int emp_id;
	
	String firstname;
	String lastname;
	String password;
	int age;
	String address;
	String city;
	int pincode;
	
	public Employee(){
		
	}

	public Employee(int emp_id, String firstname, String lastname, String password, int age, String address,
			String city, int pincode) {
		super();
		this.emp_id = emp_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", firstname=" + firstname + ", lastname=" + lastname + ", password="
				+ password + ", age=" + age + ", address=" + address + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
