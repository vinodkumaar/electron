package electron.domain;


import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {


    @Test
    public void shouldBeAbleToAddToCart()
    {


        Cart cart = new Cart();
        cart.add(1);

        assertNotNull(cart.getCartItems());
        assertEquals(1, cart.getCartItems().size());

        cart.add(1);
        assertEquals(1, cart.getCartItems().size());

        cart.add(2);
        assertEquals(2, cart.getCartItems().size());

    }

    @Test
    public void shouldBeAbleToGetQuantity()
    {

        Cart  cart = new Cart();
        cart.add(1);

        assertEquals(1, cart.getQuantity());

        cart.add(1);
        assertEquals(2, cart.getQuantity());

        cart.add(2);
        assertEquals(3, cart.getQuantity());


    }

    @Test
    public void shouldBeAbleToChangeQuantityInCartItem(){

        Cart  cart = new Cart();
        cart.add(1);

        assertEquals(1, cart.getCartItem(1).getQuantity());

        cart.add(1);
        assertEquals(2, cart.getCartItem(1).getQuantity());

        cart.add(1);
        assertEquals(3, cart.getCartItem(1).getQuantity());

        cart.add(2);
        assertEquals(3, cart.getCartItem(1).getQuantity());
        assertEquals(1, cart.getCartItem(2).getQuantity());
    }


}
