package base.product;

import java.util.List;

public interface ProductDao {

	// 전체상품 높은 가격순으로 정렬(내림차순)
	List<Product> findAllByPriceHigh();
	
	// 브랜드 별 높은 가격 순 정렬
	List<Product> findBrandPriceHigh(String p_brand);
	
	// 전체상품 낮은 가격 순부터 정렬()
	List<Product> findAllByPriceLow();
	
	// 브랜드별 낮은 가격 순으로 정렬(오름차순)
	List<Product> findBrandPriceLow(String p_brand);
	
	// 전체상품 조회순 높은 순으로 정렬(인기순)
	 List<Product> findAllByClickCountHigh();
	
	// 브랜드별 조회순 높은 순으로 정렬(인기순)
	 List<Product> findBrandClickCountHigh();
	
	
}
