package electron.controllers;

import electron.domain.Cart;
import electron.domain.CartItem;
import electron.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class CartController {

  @Autowired
  ItemService itemService;

  @RequestMapping(value = "/cart", method = RequestMethod.GET)
  public String publicCart(Map<String, Object> model, HttpSession session) {

    Cart cart = (Cart) session.getAttribute("cart");

    for (CartItem cartItem : cart.getCartItems()) {
      model.put("" + cartItem.getItemId(), itemService.find(cartItem.getItemId()));
    }
    model.put("cart", cart);

    return "cart";
  }

  @RequestMapping(value = "/item/delete/{id}", method = RequestMethod.GET)
  public String deleteItemFromCart(Map<String, Object> model, HttpSession session, @PathVariable Integer id) {

    Cart cart = (Cart) session.getAttribute("cart");
    cart.deleteCartItem(id);
    return "redirect:/cart";
  }


}
