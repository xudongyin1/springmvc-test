package com.xu.controller;

import com.xu.Student;
import com.xu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 16:11 2020/5/1
 * @Modified By:
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public Collection<Student> findAll(HttpServletResponse response) {
        response.setContentType("text/json;charset=UTF-8");
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") int id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.SaveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.SaveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        studentRepository.deleteById(id);
    }
}
