package com.jbk.SpringDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.jbk.SpringDB.dao.StudentDao;
import com.jbk.SpringDB.entity.Student;

@Service
public class StudentService {
	@Autowired
	StudentDao dao;

	public String insertData(Student s) {
		String msg = dao.insertData(s);
		return msg;
	}

	public String delete(int s) {
		String msg = dao.delete(s);
		return msg;

	}

//	public String updateStudent(Student s) {
//		String  mgs=dao.updateStudent(s);
//		return mgs;
//		
//	}

	public String updateStudent(Student s, int stud_id) {
		String msg = dao.updateStudent(s, stud_id);
		return msg;
	}

	public Student singlefletchData(int stud_id) {
	    Student std = dao.singleFletchData(stud_id);
	    return std;
	}
		
}

