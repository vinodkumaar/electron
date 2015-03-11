package electron.controllers;

import electron.domain.Item;
import electron.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class ItemsController {

    @Autowired
    private ItemService itemService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String publicHome(Map<String, Object> model) {
        model.put("items", itemService.findItems());
        return "home";
    }
}
