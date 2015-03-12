package electron.domain;

import java.util.List;

public class Cart {

  private int id;
  private List<CartItem> cartItems;

  public Cart(int id, List<CartItem> cartItems) {
    this.id = id;
    this.cartItems = cartItems;
  }

  public List<CartItem> getCartItems() {
    return cartItems;
  }
}
