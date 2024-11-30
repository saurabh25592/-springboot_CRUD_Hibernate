package com.jbk.SpringDB.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.SpringDB.entity.Student;

@Repository
public class StudentDao {
	@Autowired
	SessionFactory factory;

	public String insertData(Student s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();

		ss.persist(s);
		tr.commit();
		ss.close();

		return "Data Inserted";

	}

	public String delete(int stud_id) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		Student s = ss.get(Student.class, stud_id);
		ss.remove(s);
		tr.commit();
		ss.close();

		return "data is deleted";
	}

//	public String updateStudent(Student student) {
//	    Session ss = factory.openSession();
//	    Transaction tr = ss.beginTransaction();
//	    
//	    // Fetch the existing student entity
//	    Student s = ss.get(Student.class, student.getStud_id());
//	    if (s == null) {
//	        ss.close();
//	        return "Student not found";
//	    }
//	 
//	    s.setStud_id(student.getStud_id());
//	    s.setStud_name(student.getStud_name());
//
//	    ss.update(s);
//	    tr.commit();
//	    ss.close();
//	    
//	    return "Student updated successfully";
//	}

	public String updateStudent(Student s, int stud_id) {
	    Session ss = factory.openSession();
	    Transaction tr = ss.beginTransaction();

	    Student std = ss.get(Student.class, stud_id);
	    if (std == null) {
	        ss.close();
	        return "Student not found.";
	    }

	    std.setStud_name(s.getStud_name()); // Copy new data
	    ss.update(std); // Update in database
	    tr.commit();
	    ss.close();

	    return "Data updated successfully.";
	}

	
	
	
	
	public Student singleFletchData(int stud_id) {
	    Session ss = factory.openSession();
	    Transaction tr = ss.beginTransaction();

	    Student std = ss.get(Student.class, stud_id); // Fetch the student
	    tr.commit();
	    ss.close();

	    return std; // Return fetched data
	}

	
	
}
