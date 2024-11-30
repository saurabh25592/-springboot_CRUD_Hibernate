package com.jbk.SpringDB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.SpringDB.entity.Student;
import com.jbk.SpringDB.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/savedata")
	public String insertData(@RequestBody Student s) {
		String msg = service.insertData(s);
		return msg;
	}

	@DeleteMapping("deletedata/{stud_id}")
	public String delete(@PathVariable int stud_id) {
		String msg = service.delete(stud_id);
		return msg;
	}

//	@PutMapping("/update")
//	public String updateStudent(@RequestBody Student student) {
//	    String msg = service.updateStudent(student);
//	    return msg;
//	}

	@PutMapping("/updatedata")
	public String updateStudent(@RequestBody Student s, @PathVariable int stud_id) {
		String msg = service.updateStudent(s, stud_id);
		return msg;
	}

	
	@GetMapping("/getsingledata/{stud_id}")
	public Student singlefletchData(@PathVariable int stud_id) {
	    return service.singlefletchData(stud_id);
	}
}
