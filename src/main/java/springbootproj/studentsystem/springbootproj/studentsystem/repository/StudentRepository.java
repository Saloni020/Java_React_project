package springbootproj.studentsystem.springbootproj.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootproj.studentsystem.springbootproj.studentsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}
