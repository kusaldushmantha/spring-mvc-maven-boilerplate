package springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By: Kusal Kankanamge
 * Created On: 04-Apr-2020
 */
@Controller
public class HomeController
{
    @RequestMapping( "/" )
    public String getHomePage()
    {
        return "home-page";
    }
}
