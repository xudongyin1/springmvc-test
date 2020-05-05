package com.xu.repository;

import com.xu.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 16:02 2020/5/1
 * @Modified By:
 */
@Repository
public class impl implements StudentRepository {
    private static Map<Integer,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "李四", 21));
        studentMap.put(2, new Student(2, "王五", 22));
        studentMap.put(3, new Student(3, "张三", 23));

    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public void SaveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(int id) {
        studentMap.remove(id);
    }
}
