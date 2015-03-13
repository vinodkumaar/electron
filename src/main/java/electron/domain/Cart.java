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

    public void add(Item item) {

        CartItem cartItem = getCartItem(item.getId());
        if (cartItem == null) {
            cartItem = new CartItem(item);
            cartItems.add(cartItem);
        } else {
            cartItem.add();
        }
    }

    public int getQuantity() {

        int quantity = 0;
        for (CartItem cartItem : cartItems) {
            quantity += cartItem.getQuantity();
        }
        return quantity;
    }

    public CartItem getCartItem(int itemId) {

        for (CartItem cartItem : cartItems) {
            if (cartItem.getItem().getId() == itemId) {
                return cartItem;
            }
        }
        return null;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : cartItems) {
            totalPrice += cartItem.getTotalPrice();
        }
        return totalPrice;
    }

    public void deleteCartItem(int itemId) {
        cartItems.remove(getCartItem(itemId));
    }
}
