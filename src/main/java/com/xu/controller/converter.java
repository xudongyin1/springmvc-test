package com.xu.controller;

import com.xu.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 14:50 2020/5/1
 * @Modified By:
 */
@RestController
@RequestMapping("/converter")
public class converter {
    @RequestMapping("/date")
    public String date(Date date) {
        return date.toString();
    }

    @RequestMapping("/user")
    public String user(User user) {
        return user.toString();
    }
}
