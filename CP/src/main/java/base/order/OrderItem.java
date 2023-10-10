package base.order;

import java.util.ArrayList;
import java.util.List;

import base.product.Product;

public class OrderItem {
	/*
	이름     널?       유형         
	------ -------- ---------- 
	oderitemNO  NOT NULL NUMBER(10) 
	oderitemQTY          NUMBER(10) 
	oderNO            NUMBER(10) 
	P_NO            NUMBER(10) 
	*/
	
	private int oderitemno;
	private int oderitemqty;
	/********FK********/
	private int oderno;
	private int productno;
	/*******FK*******/
	private Product product;
	
	public OrderItem() {
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
	}

	public OrderItem(int oderitemno, int oderitemqty, int oderno, int productno, Product product) {
		super();
		this.oderitemno = oderitemno;
		this.oderitemqty = oderitemqty;
		this.oderno = oderno;
		this.productno = productno;
		this.product = product;
	}

	public int getOderitemno() {
		return oderitemno;
	}

	public void setOderitemno(int oderitemno) {
		this.oderitemno = oderitemno;
	}

	public int getOderitemqty() {
		return oderitemqty;
	}

	public void setOderitemqty(int oderitemqty) {
		this.oderitemqty = oderitemqty;
	}

	public int getOderno() {
		return oderno;
	}

	public void setOderno(int oderno) {
		this.oderno = oderno;
	}

	public int getProductno() {
		return productno;
	}

	public void setProductno(int productno) {
		this.productno = productno;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItem [oderitemno=" + oderitemno + ", oderitemqty=" + oderitemqty + ", oderno=" + oderno
				+ ", productno=" + productno + ", product=" + product + "]";
	}
	
	
	
	
}
