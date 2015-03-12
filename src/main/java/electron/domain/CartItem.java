package electron.domain;


import javax.persistence.*;

@Entity
@Table(name = "CARTITEM")
public class CartItem {

  @Id
  @Column(name = "ID", length = 16)
  private int id;

  @ManyToOne
  private Cart cart;

  @OneToOne
  private Item item;

  @Column(name="QUANTITY")
  private int quantity;

  public CartItem(int id, int quantity) {
    this.id = id;
    this.quantity = quantity;

  }
}