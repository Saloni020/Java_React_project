package springbootproj.studentsystem.springbootproj.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootproj.studentsystem.springbootproj.studentsystem.model.Student;
import springbootproj.studentsystem.springbootproj.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student); //.save() saves an entity to the database
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll(); //gets all record from the database
	}

	
}
