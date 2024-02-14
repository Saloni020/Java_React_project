package springbootproj.studentsystem.springbootproj.studentsystem.service;

import java.util.List;

import springbootproj.studentsystem.springbootproj.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
}