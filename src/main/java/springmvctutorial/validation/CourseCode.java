package springmvctutorial.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created By: Kusal Kankanamge
 * Created On: 05-Apr-2020
 */
@Constraint( validatedBy = CourseCodeConstraintValidator.class )
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention( RetentionPolicy.RUNTIME )
public @interface CourseCode
{
    // define default course code
    String value() default "LUV";

    // define default error message
    String message() default "must start with LUV";

    // define default groups
    Class<?>[] groups() default {};

    // define default payload
    Class<? extends Payload>[] payload() default {};
}
