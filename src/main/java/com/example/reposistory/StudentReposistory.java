package com.example.demo.reposistory;
import org.springframework.data.jpa.reposistory.JpaRepository;
import org.springframework.stereotype.Reposistory;

import com.example.demo.entity.Student;

@Repository
public interface StudentReposistory extends JpaRepository<Student,Integer>{
        
}