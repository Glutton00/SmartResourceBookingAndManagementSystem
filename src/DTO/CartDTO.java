package DTO;

import java.util.List;

public class CartDTO {
	private String cartId;
	private int numberOfItems;
	private List<ResourceDTO> cartItems;

	public CartDTO(String cartId, List<ResourceDTO> cartItems) {
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

	public List<ResourceDTO> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<ResourceDTO> cartItems) {
		this.cartItems = cartItems;
	}

}
