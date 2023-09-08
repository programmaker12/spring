package com.student.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.student.project.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
