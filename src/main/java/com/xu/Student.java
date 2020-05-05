package com.xu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 15:58 2020/5/1
 * @Modified By:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;
    private boolean flag;
    private List<String> hobby;
    private List<String> selectHobby;
    private int radioId;
    private Map<Integer,String> grademap;
    private int selectGrade;
    private Map<Integer,String> citiesmap;
    private int selectCity;
    private String my;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
