package base.product;

import java.util.List;

import org.springframework.stereotype.Repository;

import base.product.mapper.ProductMapper;

@Repository(value = "productDaoImplMyBatisMapperInterface")
public class ProductDaoImpl implements ProductDao{
	
	private ProductMapper productMapper;
	
	public ProductMapper getProductMapper() {
	
		return productMapper;
	}

	public void setProductMapper(ProductMapper productMapper) {
		System.out.println("#### productDaoImplMyBatisMapperInterface() : setProductrMapper() 메쏘드호출  ");
		this.productMapper = productMapper;
	}

	@Override
	public List<Product> findAllByPriceHigh() {
		System.out.println("#### productDaoImplMyBatisMapperInterface() :findAllByPriceHigh() 호출  ");
		
		return productMapper.findAllByPriceHigh();
	}

	@Override
	public List<Product> findBrandPriceHigh(String p_brand) {
		System.out.println("#### productDaoImplMyBatisMapperInterface() :findBrandPriceHigh() 호출  ");
		
		return productMapper.findBrandPriceHigh(p_brand);
	}

	@Override
	public List<Product> findAllByPriceLow() {
		System.out.println("#### productDaoImplMyBatisMapperInterface() :findAllByPriceLow() 호출  ");
		
		return productMapper.findAllByPriceLow();
	}

	@Override
	public List<Product> findBrandPriceLow(String p_brand) {
		System.out.println("#### productDaoImplMyBatisMapperInterface() :findAllByPriceLow() 호출  ");
		
		return productMapper.findBrandPriceLow(p_brand);
	}

	@Override
	public List<Product> findAllByClickCountHigh() {
		
		return productMapper.findAllByClickCountHigh();
	}

	@Override
	public List<Product> findBrandClickCountHigh() {
		
		return productMapper.findBrandClickCountHigh();
	}


}
