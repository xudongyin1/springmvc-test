package com.xu.validator;

import com.xu.Account;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 17:43 2020/5/2
 * @Modified By:
 */
public class AccountValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Account.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", null,"姓名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null,"密码不能为空");
    }
}
