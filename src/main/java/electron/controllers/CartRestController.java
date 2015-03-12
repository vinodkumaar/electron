package electron.controllers;

import electron.domain.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController
public class CartRestController {

    @RequestMapping(value = "/rest/cart/items", method = RequestMethod.POST)
    public ResponseEntity postCartItem(@RequestBody Item item, HttpSession session) {
        Integer id = (Integer) session.getAttribute("cartId");
        if( id == null)
        {
            id = new Integer((int)(Math.random()*1000));
            System.out.println("id"+id);
            session.setAttribute("cartId", id);
        }
        else
        {
            System.out.println("Found in session");
        }

        return ResponseEntity.ok("{\"value\":"+id+"}");
    }
}
