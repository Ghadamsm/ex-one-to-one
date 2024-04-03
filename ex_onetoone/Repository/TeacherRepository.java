package com.example.ex_onetoone.Repository;

import com.example.ex_onetoone.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher , Integer> {


    Teacher findTeacherById(Integer id);
}
