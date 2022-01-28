package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
@RestController
public class StudentController {
	@GetMapping("/student")
	public List<Student> getStudent(){
		ArrayList<Student> student = new ArrayList<Student>();
		student.add(new Student(1,"Raj","Kumar","Rajkumar@gmail.com"));
		student.add(new Student(2,"Naveen","Kumar","Naveenkumar@gmail.com"));
		student.add(new Student(3,"Vignesh","Sai","Vigneshsai@gmail.com"));
		student.add(new Student(4,"Ramesh","babu","Rameshbabu@gmail.com"));
		student.add(new Student(5,"Ram","Sai","Ramsai@gmail.com"));
		student.add(new Student(6,"Balaji","Naga","BalajiNaga@gmail.com"));
		return student; 
	}

}
