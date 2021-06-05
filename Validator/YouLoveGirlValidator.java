package com.validation.Validator;

import com.validation.Validator.Annotation.YouLoveGirl;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class YouLoveGirlValidator implements ConstraintValidator<YouLoveGirl,String> {

    public static final List<String> YouLoveGirl = Arrays.asList("LJY", "刘嘉燕", "长得像刘嘉燕的女人");
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return YouLoveGirl.contains(s);
    }
}
