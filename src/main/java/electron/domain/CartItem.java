package electron.domain;


public class CartItem {
    private Item item;

    private int quantity;

    public CartItem() {
    }

    public CartItem(Item item) {
        this.quantity = 1;
        this.item=item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void add() {
        quantity++;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return item.getPrice()*quantity;
    }

    public Item getItem() {
        return item;
    }
}