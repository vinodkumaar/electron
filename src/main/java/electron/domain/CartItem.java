package electron.domain;

public class CartItem {

  private int itemId;

  private int quantity;

  public CartItem(int itemId, int quantity) {
    this.itemId = itemId;
    this.quantity = quantity;
  }

  public int getItemId() {
    return itemId;
  }

}