package spring_demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_demo.entity.Student;
import spring_demo.repo.StudentRepo;
import spring_demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}
	
	
	@Override
	public Student findStudentById(int id) {
		return repo.findById(id).orElseThrow();
	}

	@Override
	public Student updateStudent(int id,Student upstudent) {
		Student student1=repo.findById(id).get();
		student1.setName(upstudent.getName());
		student1.setEmail(upstudent.getEmail());
		student1.setAddress(upstudent.getAddress());
		return repo.save(student1);
	}
}
