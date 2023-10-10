package base.cart;

import base.product.Product;

public class Cart {

	private int cart_no;	 // 카트번호
	private int cart_qty;    // 카트수량
	private String u_id;	 // 유저아이디
	private Product product; // 상품

	public Cart(int cart_no, int cart_qty, String u_id, Product product) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.u_id = u_id;
		this.product = product;
	}

	public int getCart_no() {
		return cart_no;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", u_id=" + u_id + ", product=" + product + "]";
	}

	
	
}
