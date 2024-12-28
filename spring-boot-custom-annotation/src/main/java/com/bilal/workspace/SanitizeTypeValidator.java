package com.bilal.workspace;

import com.bilal.workspace.model.SanitizeType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SanitizeTypeValidator implements ConstraintValidator<SanitizeInputValidate, String> {

    private SanitizeType selectedSanitize;

    @Override
    public void initialize(SanitizeInputValidate constraintAnnotation) {
        selectedSanitize = constraintAnnotation.sanitizeType();
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("yes1");
        if (selectedSanitize.validate(selectedSanitize.selectedRegex, value))
            return true;

        // Disable the default constraint violation message
        constraintValidatorContext.disableDefaultConstraintViolation();

        // Add a custom constraint violation message
        constraintValidatorContext.buildConstraintViolationWithTemplate(
                "Input \"" + value + "\" does not match the pattern " + selectedSanitize.selectedMessage
        ).addConstraintViolation();
        return false;
    }

}
