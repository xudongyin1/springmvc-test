package com.xu.repository;

import com.xu.Student;

import java.util.Collection;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 15:57 2020/5/1
 * @Modified By:
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(int id);
    public void SaveOrUpdate(Student student);
    public void deleteById(int id);
}
