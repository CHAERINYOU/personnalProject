package base.order;

import java.sql.Date;

public class Order {
	/*
	이름        널?       유형            
			--------- -------- ------------- 
			orderNO      NOT NULL NUMBER(10)    
			orderDESC             VARCHAR2(100) 
			orderDATE             DATE          
			orderPRICE            NUMBER(10)    
			orderADDRESS          VARCHAR2(100) 
			U_ID               VARCHAR2(100) 
	*/
	
	private int orderno;
	private String orderdesc;
	private Date orderdate;
	private int orderprice;
	private String orderaddress;
	/************* FK ****************/
	private String userid;
	/*********** List<OrderItem> ****/
	public Order() {
		
	}
	
	public Order(int orderno, String orderdesc, Date orderdate, int orderprice, String orderaddress, String userid) {
		super();
		this.orderno = orderno;
		this.orderdesc = orderdesc;
		this.orderdate = orderdate;
		this.orderprice = orderprice;
		this.orderaddress = orderaddress;
		this.userid = userid;
	}

	public int getOrderno() {
		return orderno;
	}

	public void setOrderno(int orderno) {
		this.orderno = orderno;
	}

	public String getOrderdesc() {
		return orderdesc;
	}

	public void setOrderdesc(String orderdesc) {
		this.orderdesc = orderdesc;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public int getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}

	public String getOrderaddress() {
		return orderaddress;
	}

	public void setOrderaddress(String orderaddress) {
		this.orderaddress = orderaddress;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Order [orderno=" + orderno + ", orderdesc=" + orderdesc + ", orderdate=" + orderdate + ", orderprice="
				+ orderprice + ", orderaddress=" + orderaddress + ", userid=" + userid + "]";
	}
	
	
	

}