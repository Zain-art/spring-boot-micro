package aws.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWSController {

    @GetMapping("/")

    public String home(){
        return "hello this aws ce2 deploy a project on amazon of spring boot";
    }

}
