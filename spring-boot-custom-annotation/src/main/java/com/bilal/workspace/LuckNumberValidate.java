package com.bilal.workspace;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LuckNumberValidator.class)
public @interface LuckNumberValidate {
    public String message() default "This is not lucky number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
