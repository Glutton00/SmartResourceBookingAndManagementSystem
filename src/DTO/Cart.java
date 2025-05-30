package DTO;

import java.util.List;

public class Cart {
	private String cartId;
	private int numberOfItems;
	private List<Resource> cartItems;

	public Cart(String cartId, List<Resource> cartItems) {
		this.cartId = cartId;
		this.cartItems = cartItems;
		this.numberOfItems = cartItems.size();
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public List<Resource> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Resource> cartItems) {
		this.cartItems = cartItems;
	}

}
