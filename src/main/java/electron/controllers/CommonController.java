package electron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
@Controller
public class CommonController {
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String publicHome(Map<String, Object> model) {
        return "error";
    }
}
