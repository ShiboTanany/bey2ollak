package bey2ollaktask.demo.endpoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class testLogin {

    @RequestMapping("/login")
    public void test(Model m,String name) {
        m.addAttribute("index", new Date()+name);

    }
}
