package sb.roundup.roundup.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorld {

    @GetMapping("helloworld")
    public String getMethodName() {
        return "Hello world";
    }
    
}
