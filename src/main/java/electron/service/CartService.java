package electron.service;

import electron.domain.Cart;
import electron.domain.CartItem;
import electron.domain.Item;
import electron.repository.CartItemRepository;
import electron.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
  private CartRepository cartRepository;
  private CartItemRepository cartItemRepository;

  @Autowired
  public CartService(CartRepository cartRepository, CartItemRepository cartItemRepository) {
    this.cartRepository = cartRepository;
    this.cartItemRepository = cartItemRepository;
  }


  public Cart getCart(int id) {
    return cartRepository.findOne(id);
  }

  public void saveCartItem(int cartId, CartItem cartItem) {

    Cart cart = getCart(cartId);

    List<CartItem> items = cart.getCartItem();
    if(null == items) {
      items = new ArrayList<CartItem>();
    }

    items.add(cartItem);
    cart.setCartItem(items);

    cartRepository.save(cart);

  }
}
