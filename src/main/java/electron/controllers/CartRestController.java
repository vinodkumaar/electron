package electron.controllers;

import electron.domain.Cart;
import electron.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
public class CartRestController {

    @RequestMapping(value = "/rest/cart/items", method = RequestMethod.POST)
    public ResponseEntity postCartItem(@RequestBody Item item, HttpSession session) {

        Cart cart= (Cart)session.getAttribute("cart");

        if(cart==null)
        {
            cart = new Cart();
            session.setAttribute("cart",cart);
        }

        cart.add(item.getId());

        return ResponseEntity.ok("{\"quantity\":"+cart.getQuantity()+"}");
    }
}
