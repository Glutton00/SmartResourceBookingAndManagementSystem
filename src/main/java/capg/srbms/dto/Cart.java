package capg.srbms.dto;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private String cartId;
    private int noOfItems;
    private List<Resource> cartItems;

    public Cart(String cartId) {
        this.cartId = cartId;
        this.cartItems = new ArrayList<>();
        this.noOfItems = 0;
    }

    public String getCartId() { return cartId; }
    public int getNoOfItems() { return noOfItems; }
    public List<Resource> getCartItems() { return cartItems; }

    public void setNoOfItems(int noOfItems) { this.noOfItems = noOfItems; }
    public void addItem(Resource res) {
        cartItems.add(res);
        noOfItems++;
    }
    public void removeItem(Resource res) {
        cartItems.remove(res);
        noOfItems--;
    }
    public void clearCart() {
        cartItems.clear();
        noOfItems = 0;
    }
}
