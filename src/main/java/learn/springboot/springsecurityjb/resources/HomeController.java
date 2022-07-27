package learn.springboot.springsecurityjb.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome to spring boot application</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome to spring boot application user panel</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome to spring boot application admin</h1>");
    }
}
