package com.student.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.project.student.repository.StudentRepository;
//import com.student.project.model.Student;
@Service
//@Transactional
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> listAll(){
		return studentRepository.findAll();
	}
	
	public Student registerStudent(Student student) {
		return studentRepository.save(student);
	}
}
