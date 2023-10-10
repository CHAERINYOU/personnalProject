package base.product;

public class Product {

	private int p_no;          // 상품 번호
	private String p_name; 	   // 상품 이름
	private int p_price;	   // 상품 가격
	private String p_image;	   // 상품 이미지
	private String p_detail;   // 상품 상세페이지
	private String p_brand;	   // 상품 브랜드
	private int p_click_count; // 상품 조회수
	private int p_amount;	   // 상품 수량

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public String getP_image() {
		return p_image;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public String getP_detail() {
		return p_detail;
	}

	public void setP_detail(String p_detail) {
		this.p_detail = p_detail;
	}

	public String getP_brand() {
		return p_brand;
	}

	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}

	public int getP_click_count() {
		return p_click_count;
	}

	public void setP_click_count(int p_click_count) {
		this.p_click_count = p_click_count;
	}

	public int getP_amount() {
		return p_amount;
	}

	public void setP_amount(int p_amount) {
		this.p_amount = p_amount;
	}

	
	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_name=" + p_name + ", p_price=" + p_price + ", p_image=" + p_image
				+ ", p_detail=" + p_detail + ", p_brand=" + p_brand + ", p_click_count=" + p_click_count + ", p_amount="
				+ p_amount + "]";
	}

}
