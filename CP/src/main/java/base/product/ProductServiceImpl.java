package base.product;

import java.util.List;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public ProductServiceImpl() throws Exception {

	}

	@Override
	// 전체상품 높은 가격순으로 정렬(내림차순)
	public List<Product> findAllByPriceHigh() {
	
		return productDao.findAllByClickCountHigh();
	}

	
	// 브랜드별 가격 높은순 정렬
	@Override
	public List<Product> findBrandPriceHigh(String p_brand) {
		
		return null;
	}

	// 전체상품 낮은 가격순으로 정렬(오름차순)
	@Override
	public List<Product> findAllByPriceLow() {
		
		return null;
	}

	// 브랜드별 낮은 가격순으로 정렬(오름차순)
	@Override
	public List<Product> findBrandPriceLow(String p_brand) {
		
		return null;
	}
	
	// 전체상품 조회순 높은 순으로 정렬(인기순)
	@Override
	public List<Product> findAllByClickCountHigh() {
		
		return null;
	}

	
	// 브랜드별 조회순 높은 순으로 정렬(인기순)
	@Override
	public List<Product> findBrandClickCountHigh() {
		
		return null;
	}
	
	
	// 검색 기능 구현
	@Override
	public List<Product> searchProductsByName(String keyword) {
		
		return null;
	}

	@Override
	public List<Product> productSelectAll() {
		
		return null;
	}

	
	// 전체 목록 뽑아오기
	@Override
	public Product selectProductByNo(int p_no) {
		
		return null;
	}

	@Override
	public List<Product> selectProductByBrand(String p_brand) {
		
		return null;
	}

	
	// 상품 번호로 상품 뽑아오기
	@Override
	public List<Product> soldOutProducts(int p_size) {


		return null;
	}

	// 브랜드로 상품 뽑아오기
	@Override
	public List<Product> getTwoProductsPerBrand() {
		
		
		return null;
	}

}