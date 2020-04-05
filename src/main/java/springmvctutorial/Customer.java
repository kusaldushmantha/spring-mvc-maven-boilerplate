package springmvctutorial;

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
}
