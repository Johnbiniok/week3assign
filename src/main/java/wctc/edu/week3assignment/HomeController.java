package wctc.edu.week3assignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/forward-me")
    public String doForward() {
        return "forward:/learn/exchange";
    }

    @RequestMapping("/redirect-me")
    public String doRedirect() {
        //return "redirect:http://www.wctc.edu";
        return "redirect:/learn/exchange";
    }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
