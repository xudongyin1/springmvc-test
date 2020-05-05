package com.xu;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 22:05 2020/5/2
 * @Modified By:
 */
@Data
public class Person {
    @NotEmpty(message = "名字不能为空")
    private String username;
    @Size(min = 6, max = 14, message = "密码为6-14位")
    private String password;
    @Email(regexp = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$", message = "邮箱格式不对")
    private String email;
    @Pattern(regexp = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$",message = "请输入正确的电话号码")
    private String phone;
}
