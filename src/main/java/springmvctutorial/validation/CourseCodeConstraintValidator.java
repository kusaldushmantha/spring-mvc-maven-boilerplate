package springmvctutorial.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created By: Kusal Kankanamge
 * Created On: 05-Apr-2020
 */
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>
{
    private String coursePrefix;

    @Override
    public void initialize( CourseCode theCourseCode )
    {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid( String theCode, ConstraintValidatorContext constraintValidatorContext )
    {
        return theCode != null && theCode.startsWith( coursePrefix );
    }
}
