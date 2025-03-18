package com.zhcc.validation;

import com.zhcc.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValication implements ConstraintValidator<State,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //提供校验规则
        if (s == null) {
            return false;
        }
        if (s.equals("已发布") || s.equals("草稿")){
            return true;
        }
        return false;
    }
}
