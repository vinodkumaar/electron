package electron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class UserRegistrationController {


    @RequestMapping(value = "/user_registration", method = RequestMethod.GET)
    public String listItems(Map<String, Object> model) {
//        model.put("message", "Hello Electron!");
        return "user_registration";
    }

    @RequestMapping(value = "/post_registration", method = RequestMethod.POST)
    @ResponseBody
    public String publicHome(Map<String, Object> model,HttpServletRequest request) {


        System.out.println(request.getParameter("dname"));
        model.put("user", request.getParameter("dname"));

        return "home";
    }
}
