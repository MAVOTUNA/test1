package helloec2.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("test")
    @ResponseBody
    public String test() {
        return "Hello ec2";
    }


}
