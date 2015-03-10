package electron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class ItemsController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listItems(Map<String, Object> model) {
        model.put("message", "Hello Electron!");
        return "welcome";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String publicHome(Map<String, Object> model) {
        return "home";
    }
}
