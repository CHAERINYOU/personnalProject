package base.product;

public class Product {

	private int productno;          // 상품 번호
	private String productname; 	   // 상품 이름
	private int productprice;	   // 상품 가격
	private String productimage;	   // 상품 이미지
	private String productdetail;   // 상품 상세페이지
	private String productbrand;	   // 상품 브랜드
	private int productclickcount; // 상품 조회수
	private int productamount;	   // 상품 수량

	public int getproductno() {
		return productno;
	}

	public void setproductno(int productno) {
		this.productno = productno;
	}

	public String getproductname() {
		return productname;
	}

	public void setproductname(String productname) {
		this.productname = productname;
	}

	public int getproductprice() {
		return productprice;
	}

	public void setproductprice(int productprice) {
		this.productprice = productprice;
	}

	public String getproductimage() {
		return productimage;
	}

	public void setproductimage(String productimage) {
		this.productimage = productimage;
	}

	public String getproductdetail() {
		return productdetail;
	}

	public void setproductdetail(String productdetail) {
		this.productdetail = productdetail;
	}

	public String getproductbrand() {
		return productbrand;
	}

	public void setproductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public int getproductclick_count() {
		return productclickcount;
	}

	public void setproductclick_count(int productclick_count) {
		this.productclickcount = productclick_count;
	}

	public int getproductamount() {
		return productamount;
	}

	public void setproductamount(int productamount) {
		this.productamount = productamount;
	}

	
	@Override
	public String toString() {
		return "Product [productno=" + productno + ", productname=" + productname + ", productprice=" + productprice + ", productimage=" + productimage
				+ ", productdetail=" + productdetail + ", productbrand=" + productbrand + ", productclickcount=" + productclickcount + ", productamount="
				+ productamount + "]";
	}

}
