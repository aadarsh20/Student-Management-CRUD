package spring_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_demo.entity.Student;
import spring_demo.service.StudentService;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@Autowired
	StudentService service;
	
	
	//Save
	@PostMapping("save")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	//FindAll
	@GetMapping("findAll")
	public List<Student> findAll()
	{
		return service.findAll();
	}
	
	//Find
	@GetMapping("findId/{id}")
	public Student studentFindById(@PathVariable int id)
	{
		return service.findStudentById(id);
	}
	
	//delete
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		service.deleteStudent(id);
	}
	
	//update
	@PutMapping("update/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student student)
	{
		return service.updateStudent(id, student);
	}
}