package base.product;

import java.util.List;

public interface ProductService {

	// 전체상품 높은 가격순으로 정렬(내림차순)
	List<Product> findAllByPriceHigh();

	// 브랜드별 가격 높은순 정렬
	List<Product> findBrandPriceHigh(String p_brand);

	// 전체상품 낮은 가격순으로 정렬(오름차순)
	List<Product> findAllByPriceLow();
	
	// 브랜드별 낮은 가격순으로 정렬(오름차순)
	List<Product> findBrandPriceLow(String p_brand);
	
	// 전체상품 조회순 높은 순으로 정렬(인기순)
	List<Product> findAllByClickCountHigh();
	
	// 브랜드별 조회순 높은 순으로 정렬(인기순)
	List<Product> findBrandClickCountHigh();

	// 검색 기능 구현
	List<Product> searchProductsByName(String keyword);

	// 전체 목록 뽑아오기
	List<Product> productSelectAll();

	// 상품 번호로 상품 뽑아오기
	Product selectProductByNo(int p_no);

	// 브랜드로 상품 뽑아오기
	List<Product> selectProductByBrand(String p_brand);

	
	//품절된 상품 가져오기
	List<Product> soldOutProducts(int p_size);
    
	// 상품 번호로 상품 뽑아오기
	List<Product> getTwoProductsPerBrand();


}
