package base.cart;

import base.product.Product;

public class Cart {

	private int cartno;	 	 // 카트번호
	private int cartqty;     // 카트수량
	private String userId;	 // 유저아이디
	private Product product; // 상품

	public Cart(int cartno, int cartqty, String userid, Product product) {
		super();
		this.cartno = cartno;
		this.cartqty = cartqty;
		this.userId = userid;
		this.product = product;
	}

	public int getCartno() {
		return cartno;
	}

	public void setCartno(int cartno) {
		this.cartno = cartno;
	}

	public int getCartqty() {
		return cartqty;
	}

	public void setCart_qty(int cartqty) {
		this.cartqty = cartqty;
	}

	public String getUserid() {
		return userId;
	}

	public void setUserid(String userId) {
		this.userId = userId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cartno=" + cartno + ", cartqty=" + cartqty + ", useId=" + userId + ", product=" + product + "]";
	}

	
	
}
