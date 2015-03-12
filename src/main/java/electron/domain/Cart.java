package electron.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CART")
public class Cart {

  @Id
  @Column(name = "ID", length = 16)
  private int id;

 @OneToMany
 private List<CartItem> cartItem;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<CartItem> getCartItem() {
    return cartItem;
  }

  public void setCartItem(List<CartItem> cartItem) {
    this.cartItem = cartItem;
  }
}
