package springmvctutorial;

import springmvctutorial.validation.CourseCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created By: Kusal Kankanamge
 * Created On: 04-Apr-2020
 */
public class Customer
{
    private String firstName;

    @NotNull( message = "is required" )
    @Size( min = 1, message = "is required" )
    private String lastName;

    @NotNull( message = "is required" )
    @Min( value = 0, message = "must be greater than 0" )
    @Max( value = 10, message = "must be lesser than 10" )
    private Integer freePasses;

    @CourseCode
    private String courseCode;

    public String getCourseCode()
    {
        return courseCode;
    }

    public void setCourseCode( String courseCode )
    {
        this.courseCode = courseCode;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }

    public Integer getFreePasses()
    {
        return freePasses;
    }

    public void setFreePasses( Integer freePasses )
    {
        this.freePasses = freePasses;
    }
}
