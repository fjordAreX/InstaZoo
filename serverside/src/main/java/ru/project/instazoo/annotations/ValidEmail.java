package ru.project.instazoo.annotations;



import ru.project.instazoo.validations.EmailValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE,ElementType.TYPE,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
@Documented
public @interface ValidEmail {

String message() default "Invalid Email";

Class<?>[] groups () default {};

Class<? extends Payload>[] payload() default {};
}
