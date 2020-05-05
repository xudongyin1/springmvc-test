package com.xu.controller;

import com.xu.User;
import com.xu.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 17:55 2020/4/26
 * @Modified By:
 */
@Controller
public class DateController {
    @RequestMapping("/baseType")
    @ResponseBody
    public String basetype(int id) {
        return id + "";
    }

    @RequestMapping("/packageType")
    @ResponseBody
    public String packageType(@RequestParam(value = "num", required = false, defaultValue = "0") Integer id) {
        return id + "";
    }

    @RequestMapping("/arrayType")
    @ResponseBody
    public String arrayType(String[] names) {
        String str = Arrays.toString(names);
        return str;
    }

    @RequestMapping("/userlist")
    @ResponseBody
    public String listType(UserList users) {
        StringBuffer bf = new StringBuffer();
        for (User user : users.getUserList()) {
            bf.append(user);
        }
        return bf.toString();
    }

    @RequestMapping("/json")
    public User json(@RequestBody User user) {
        System.out.println(user);
        user.setId(6);
        user.setName("lisi");
        return user;
    }


}
