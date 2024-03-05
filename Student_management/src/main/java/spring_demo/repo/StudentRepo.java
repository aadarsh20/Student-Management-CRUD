package spring_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring_demo.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
