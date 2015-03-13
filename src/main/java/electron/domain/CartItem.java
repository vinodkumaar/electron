package electron.domain;

public class CartItem {

  private int itemId;

  private int quantity;

    public CartItem(){}
  public CartItem(int itemId) {
    this.itemId = itemId;
      this.quantity=1;
  }

  public int getItemId() {
    return itemId;
  }

    public int getQuantity() {
        return quantity;
    }

    public void add(){
        quantity++;
    }

    public void setQuantity(int quantity) {
        this.quantity=quantity;
    }
}