package com.xu.controller;

import com.xu.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 15:22 2020/5/2
 * @Modified By:
 */
@Controller
public class tagHandler {
    @RequestMapping("/get")
    public ModelAndView get() {
        ModelAndView modelAndView = new ModelAndView("tag");
        Student student = new Student(1, "张三", 22);
        student.setFlag(true);
        student.setHobby(Arrays.asList("读书", "看电影", "听音乐", "摄影", "运动", "玩游戏"));
        student.setSelectHobby(Arrays.asList("读书","摄影","玩游戏"));
        student.setRadioId(2);
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "一年级");
        map.put(2, "二年级");
        map.put(3, "三年级");
        map.put(4, "四年级");
        map.put(5, "五年级");
        student.setGrademap(map);
        student.setSelectGrade(2);
        Map<Integer,String> citiesMap = new HashMap<>();
        citiesMap.put(1, "广州");
        citiesMap.put(2, "深圳");
        citiesMap.put(3, "揭阳");
        citiesMap.put(4, "上海");
        citiesMap.put(5, "北京");
        student.setCitiesmap(citiesMap);
        student.setSelectCity(3);
        student.setMy("大家好，我是许东银。大家好，我是许东银。大家好，我是许东银。大家好，我是许东银。大家好，我是许东银。大家好，我是许东银。大家好，我是许东银。");
        modelAndView.addObject("student", student);
        return modelAndView;
    }
}
