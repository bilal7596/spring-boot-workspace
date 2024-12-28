package com.bilal.workspace;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class LuckNumberValidator implements ConstraintValidator<LuckNumberValidate, Integer> {
    @Override
    public void initialize(LuckNumberValidate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer requestNumber, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("yes");
        return LuckNumberValidator.isLucky(requestNumber);
    }

    // Define a method to check if a number is "lucky"
    private static boolean isLucky(int number) {
        return String.valueOf(number).contains("7");
    }

}
