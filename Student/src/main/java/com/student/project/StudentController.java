package com.student.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.student.project.model.Student;
//import com.student.project.service.StudentService;

@RestController
public class StudentController {
   
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> list(){
		return studentService.listAll();
	}
	@PostMapping("/registerStudent")
	public Student registerStudent(@RequestBody Student student) {
		return studentService.registerStudent(student);
	}
}
