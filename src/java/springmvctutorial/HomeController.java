package springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By: Kusal Kankanamge
 * Created On: 02-Apr-2020
 */
@Controller
public class HomeController
{
    @RequestMapping("/")
    public String showPage()
    {
        return "index"; // Name of the jsp file without prefix and suffix
    }
}
