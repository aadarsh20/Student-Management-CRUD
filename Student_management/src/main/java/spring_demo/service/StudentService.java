package spring_demo.service;

import java.util.List;

import spring_demo.entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> findAll();
	
	public void deleteStudent(int id);
	
	public Student findStudentById(int id);
	
	public Student updateStudent(int id,Student upstudent);
	

}
