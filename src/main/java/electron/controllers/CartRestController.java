package electron.controllers;

import electron.domain.Cart;
import electron.domain.CartItem;
import electron.domain.Item;
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

        return ResponseEntity.noContent().build();
    }


    @RequestMapping(value = "/rest/cart/quantity", method = RequestMethod.GET)
    public ResponseEntity getCartQuantity(HttpSession session) {

        Cart cart= (Cart)session.getAttribute("cart");

        return ResponseEntity.ok("{\"quantity\":"+(cart==null?0:cart.getQuantity())+"}");
    }

    @RequestMapping(value = "/rest/cart/cartitem/{itemId}", method = RequestMethod.PUT)
    public ResponseEntity updateCartItemQuantity(@RequestBody CartItem cartItem, @PathVariable Integer itemId, HttpSession session) {

        Cart cart= (Cart)session.getAttribute("cart");
        cart.getCartItem(itemId).setQuantity(cartItem.getQuantity());

        return ResponseEntity.noContent().build();
    }
}
