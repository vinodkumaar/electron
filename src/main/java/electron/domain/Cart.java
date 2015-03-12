package electron.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  private List<CartItem> cartItems = new ArrayList<CartItem>();


  public Cart() {

  }

  public List<CartItem> getCartItems() {
    return cartItems;
  }

    public void add(int itemId) {

        CartItem cartItem = getCartItem(itemId);
        if(cartItem==null)
        {
            cartItem = new CartItem(itemId);
            cartItems.add(cartItem);
        }
        else
        {
            cartItem.add();
        }
    }

    public int getQuantity() {

        int quantity = 0;
        for(CartItem cartItem : cartItems)
        {
            quantity+= cartItem.getQuantity();
        }
        return quantity;
    }

    public CartItem getCartItem(int itemId) {

        for(CartItem cartItem:cartItems)
        {
            if(cartItem.getItemId() == itemId)
            {
                return cartItem;
            }
        }
        return null;
    }
}
