package com.xu.converter;

import com.xu.User;
import org.springframework.core.convert.converter.Converter;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 15:23 2020/5/1
 * @Modified By:
 */
public class UserConverter implements Converter<String, User> {


    @Override
    public User convert(String source) {
        String[] args = source.split("-");
        User user = new User();
        user.setName(args[1]);
        user.setId(Integer.parseInt(args[0]));
        return user;
    }
}
