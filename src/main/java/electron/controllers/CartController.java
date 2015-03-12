package electron.controllers;

import electron.domain.Cart;
import electron.domain.CartItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CartController {

  @RequestMapping(value = "/cart", method = RequestMethod.GET)
  public String publicCart(Map<String, Object> model) {

    return "cart";
  }
}
