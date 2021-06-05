package com.validation.Validator;

import com.validation.Validator.Annotation.IsDMM;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsDmmValidator implements ConstraintValidator<IsDMM,Boolean>{
    public final Boolean isDmm = true;
    @Override
    public boolean isValid(Boolean isDmm, ConstraintValidatorContext constraintValidatorContext) {
        return this.isDmm == isDmm;
    }
}
