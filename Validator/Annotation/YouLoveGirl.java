package com.validation.Validator.Annotation;


import com.validation.Validator.YouLoveGirlValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE,ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.METHOD})
@Constraint(validatedBy = {YouLoveGirlValidator.class})
public @interface YouLoveGirl {

    String message() default "你只能喜欢LJY,刘嘉燕，长得像刘嘉燕的女人";


    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
