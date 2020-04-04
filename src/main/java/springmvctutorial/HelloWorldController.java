package springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created By: Kusal Kankanamge
 * Created On: 02-Apr-2020
 */
@Controller
public class HelloWorldController
{
    @RequestMapping( "/showForm" )
    public String showForm()
    {
        return "hello-world-form";
    }

    @RequestMapping( "/processForm" )
    public String processForm()
    {
        return "hello-user";
    }

    /**
     * Reading form data with {@link HttpServletRequest} and binding to {@link Model}
     */
    @RequestMapping( "/makeAllCaps" )
    public String makeAllCaps( HttpServletRequest request, Model model )
    {
        String userName = request.getParameter( "studentName" );
        userName = userName.toUpperCase();
        String result = "Yo! " + userName;

        model.addAttribute( "message", result );

        return "hello-user";
    }

    /**
     * Reading form data with {@link RequestParam } and binding to {@link Model}
     */
    @RequestMapping( "/makeAllCapsVersionTwo" )
    public String makeAllCapsVersionTwo( @RequestParam( "studentName" ) String userName, Model model )
    {
        userName = userName.toUpperCase();
        String result = "Hey! " + userName;

        model.addAttribute( "message", result );

        return "hello-user";
    }
}
