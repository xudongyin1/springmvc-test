package com.xu.controller;

import com.xu.Address;
import com.xu.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.spi.http.HttpContext;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 18:10 2020/4/29
 * @Modified By:
 */
@Controller
@RequestMapping("/view")
//@SessionAttributes(types = {User.class,Address.class})
public class ViewController {

    @RequestMapping("/map")
    public String map(Map<String, User> map) {
        User user = new User();
        user.setName("张三");
        user.setId(10);
        user.setAddress(new Address(1, "老南湖"));
        map.put("user", user);
        return "view";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        User user = new User();
        user.setId(2);
        user.setName("xu");
        model.addAttribute("user", user);
        return "view";
    }

    @RequestMapping("/modelandview")
    public ModelAndView modelandview() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setId(3);
        user.setName("do");
        modelAndView.addObject("user", user);
        modelAndView.setViewName("view");
        return modelAndView;
    }

    @RequestMapping("/modelandview2")
    public ModelAndView modelAndView2() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        user.setName("yin");
        user.setId(4);
        modelAndView.addObject("user", user);
        View view = new InternalResourceView("/view.jsp");
        modelAndView.setView(view);
        return modelAndView;
    }

    @RequestMapping("/modelandview3")
    public ModelAndView modelAndView3() {
        ModelAndView modelAndView = new ModelAndView("view");
        User user = new User();
        user.setId(5);
        user.setName("xdy");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/modelandview4")
    public ModelAndView modelAndView4() {
        User user = new User();
        user.setName("许");
        user.setId(6);
        Map<String, User> map = new HashMap<>();
        map.put("user", user);
        ModelAndView modelAndView = new ModelAndView("view", map);
        return modelAndView;
    }

    @RequestMapping("/modelandview5")
    public ModelAndView modelAndView5() {
        User user = new User();
        user.setId(7);
        user.setName("nanha");
        Map<String, User> map = new HashMap<>();
        map.put("user", user);
        View view = new InternalResourceView("/view.jsp");
        ModelAndView modelAndView = new ModelAndView(view, map);
        return modelAndView;
    }

    @RequestMapping("/modelandview6")
    public ModelAndView modelAndView() {
        User user = new User();
        user.setName("账户上");
        user.setId(8);
        ModelAndView modelAndView = new ModelAndView("view", "user", user);
        return modelAndView;
    }

    @RequestMapping("/request")
    public String request(HttpServletRequest request) {
        User user = new User();
        user.setId(1);
        user.setName("张三");
        request.setAttribute("user", user);
        System.out.println(request);
        return "view";
    }

//    @ModelAttribute
//    public void getuser(Model model) {
//        User user = new User();
//        user.setName("会话");
//        user.setId(11);
//        model.addAttribute("user", user);
//    }
//
//    @ModelAttribute
//    public void getuser(Map<String, User> map) {
//        User user = new User();
//        user.setName("会话");
//        user.setId(10);
//        map.put("user", user);
//    }
//
//    @ModelAttribute
//    public User getuser() {
//        User user = new User();
//        user.setId(2);
//        user.setName("李四");
//        return user;
//    }
//
//    @RequestMapping("/modelattribute")
//    public String modelattribute() {
//        return "view";
//    }

    @RequestMapping("/session")
    public String session(HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = new User();
        user.setId(11);
        user.setName("王五");
        session.setAttribute("user", user);
        return "view";
    }

    @RequestMapping("/session2")
    public String session2(HttpSession session) {
        User user = new User();
        user.setId(1);
        user.setName("王liu");
        session.setAttribute("user", user);
        return "view";
    }

    @RequestMapping("/application")
    public String application(HttpServletRequest request) {
        ServletContext application = request.getServletContext();
        User user = new User();
        user.setId(1);
        user.setName("张三");
        application.setAttribute("user",user);
        return "view";
    }
}
