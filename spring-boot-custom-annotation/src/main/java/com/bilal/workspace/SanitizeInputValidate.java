package com.bilal.workspace;

import com.bilal.workspace.model.SanitizeType;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SanitizeTypeValidator.class)
public @interface SanitizeInputValidate {
    public SanitizeType sanitizeType();

    public String message() default "Input is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
