package base.order;

import java.sql.Date;

public class Order {
	/*
	이름        널?       유형            
			--------- -------- ------------- 
			O_NO      NOT NULL NUMBER(10)    
			O_DESC             VARCHAR2(100) 
			O_DATE             DATE          
			O_PRICE            NUMBER(10)    
			O_ADDRESS          VARCHAR2(100) 
			U_ID               VARCHAR2(100) 
	*/
	
	private int o_no;
	private String o_desc;
	private Date o_date;
	private int o_price;
	private String o_address;
	/************* FK ****************/
	private String u_id;
	/*********** List<OrderItem> ****/
	

}