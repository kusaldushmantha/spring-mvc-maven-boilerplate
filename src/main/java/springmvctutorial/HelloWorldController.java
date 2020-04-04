package springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping( "/makeAllCaps" )
    public String makeAllCaps( HttpServletRequest request, Model model )
    {
        String userName = request.getParameter( "studentName" );
        userName = userName.toUpperCase();
        String result = "Yo! " + userName;

        model.addAttribute( "message", result );

        return "hello-user";
    }
}
