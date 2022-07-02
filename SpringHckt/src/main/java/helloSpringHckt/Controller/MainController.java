package helloSpringHckt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/epco")
    @ResponseBody
    public String hello(){
        return "EPCO입니다만";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}
