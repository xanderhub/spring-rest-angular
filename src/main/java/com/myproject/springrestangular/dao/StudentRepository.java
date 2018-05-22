package com.myproject.springrestangular.dao;


import com.myproject.springrestangular.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{

}
