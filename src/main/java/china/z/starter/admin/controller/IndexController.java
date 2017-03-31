package china.z.starter.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sherlock on 2017-03-31.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index")
    public String index(){
        System.out.println("进入Controller");
        return "index";
    }
}
