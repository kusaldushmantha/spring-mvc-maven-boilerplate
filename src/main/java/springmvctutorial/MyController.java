package springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By: Kusal Kankanamge
 * Created On: 03-Apr-2020
 */
@Controller
public class MyController
{
    @RequestMapping("/")
    public String getHelloWorld(){
        return "index";
    }
}
