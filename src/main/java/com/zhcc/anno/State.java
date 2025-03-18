package com.zhcc.anno;

import com.zhcc.validation.StateValication;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented //元注解
@Target({ElementType.FIELD})//元注解
@Retention(RetentionPolicy.RUNTIME)//元注解
@Constraint(validatedBy = {StateValication.class})//指定提供校验类


public @interface State {
    //校验失败后的提示信息
    String message() default "state参数的值只能为已发布或草稿";
    //指的分组
    Class<?>[] groups() default {};
    //负载 获取state注解的附加信息
    Class<? extends Payload>[] payload() default {};
}
