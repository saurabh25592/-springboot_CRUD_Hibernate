package com.jbk.SpringDB.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int stud_id;
	
	private String stud_name;
	
	public Student() 
	{
		super();
	}

	public Student(int stud_id, String stud_name) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
	}

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + "]";
	}
	
	
}
