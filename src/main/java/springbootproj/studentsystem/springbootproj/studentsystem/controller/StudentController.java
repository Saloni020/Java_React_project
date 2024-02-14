package springbootproj.studentsystem.springbootproj.studentsystem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springbootproj.studentsystem.springbootproj.studentsystem.model.Student;
import springbootproj.studentsystem.springbootproj.studentsystem.repository.StudentRepository;
import springbootproj.studentsystem.springbootproj.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	@Autowired 
	private StudentService studentserv;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@PostMapping("/add") //for HTTP post request at the URL /add
	public String add(@RequestBody Student student) {
		System.out.println("student -" +student);
		studentserv.saveStudent(student);
		return "New Student Added";
	}
	
//	@SuppressWarnings("deprecation")
//	@GetMapping("/get") //for HTTP post request at the URL /add
//	public Student get( @RequestParam("id") int id) {
//		System.out.println("hi" +id);
//		Student student = new Student();
//		/*
//		 * List<Student> list= new ArrayList<Student>(); 
//		 * list = studentRepo.findAll();
//		 * Optional<Student> st=studentRepo.findById(id);
//		 */
//		   student =(Student)studentRepo.getOne(id);
//	//	Student st=studentRepo.findOne(id);
//		return student;
//	}
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return studentserv.getAllStudents();
	}
	

}
