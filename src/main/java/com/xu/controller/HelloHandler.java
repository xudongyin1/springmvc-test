package com.xu.controller;

import com.xu.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 0:11 2020/4/26
 * @Modified By:
 */
@Controller
@RequestMapping("/hello")
public class HelloHandler {
    @RequestMapping(value = "/index", method = RequestMethod.GET, params = {"name", "id"})
//      @RequestMapping("/index/{name}/{id}")
    public String index(@RequestParam("name") String str, @RequestParam("id") int id) {
        System.out.println(str);
        System.out.println(id);
        System.out.println("执行了index");
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(User user) {
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/forward")
    public String forward() {
        return "forward:/index.jsp";
    }
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/index.jsp";
    }
}
