package base.product;

public class Product {

	private int pNo;          // 상품 번호
	private String pName; 	// 상품 이름
	private int pPrice;	    // 상품 가격
	private String pImage;	// 상품 이미지
	private String pDetail;   // 상품 상세페이지
	private String pBrand;	// 상품 브랜드
	private int pClickcount;  // 상품 조회수
	private int pAmount;	    // 상품 수량
	private int pSize;	    // 상품 수량
	

	public Product() {
		
	}
	
	public Product(int pNo, String pName, int pPrice, String pImage, String pDetail, String pBrand, int pClickcount,
			int pAmount, int pSize) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pImage = pImage;
		this.pDetail = pDetail;
		this.pBrand = pBrand;
		this.pClickcount = pClickcount;
		this.pAmount = pAmount;
		this.pSize = pSize;
	}

	public int getpSize() {
		return pSize;
	}

	public void setpSize(int pSize) {
		this.pSize = pSize;
	}

	public int getproductno() {
		return pNo;
	}

	public void setproductno(int productno) {
		this.pNo = productno;
	}

	public String getproductname() {
		return pName;
	}

	public void setproductname(String productname) {
		this.pName = productname;
	}

	public int getproductprice() {
		return pPrice;
	}

	public void setproductprice(int productprice) {
		this.pPrice = productprice;
	}

	public String getproductimage() {
		return pImage;
	}

	public void setproductimage(String productimage) {
		this.pImage = productimage;
	}

	public String getproductdetail() {
		return pDetail;
	}

	public void setproductdetail(String productdetail) {
		this.pDetail = productdetail;
	}

	public String getproductbrand() {
		return pBrand;
	}

	public void setproductbrand(String productbrand) {
		this.pBrand = productbrand;
	}

	public int getproductclick_count() {
		return pClickcount;
	}

	public void setproductclick_count(int productclick_count) {
		this.pClickcount = productclick_count;
	}

	public int getproductamount() {
		return pAmount;
	}

	public void setproductamount(int productamount) {
		this.pAmount = productamount;
	}

	@Override
	public String toString() {
		return "Product [pNo=" + pNo + ", pName=" + pName + ", pPrice=" + pPrice + ", pImage=" + pImage + ", pDetail="
				+ pDetail + ", pBrand=" + pBrand + ", pClickcount=" + pClickcount + ", pAmount=" + pAmount + ", pSize="
				+ pSize + "]";
	}



}
