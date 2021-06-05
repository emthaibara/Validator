package com.validation.Validator.Annotation;


import com.validation.Validator.IsDmmValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = {IsDmmValidator.class})
@Documented
@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsDMM {


    String message() default "你只能选，是大咪咪";


    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
