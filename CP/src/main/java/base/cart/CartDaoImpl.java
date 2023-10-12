package base.cart;

import java.util.List;

public class CartDaoImpl implements CartDao{

	private CartDao cartDao;
	
	@Override
	public int create(Cart cart) {
		
		return cartDao.create(cart);
	}

	@Override
	public int update_qty(Cart cart) {
		
		return cartDao.update_qty(cart);
	}

	@Override
	public int update_size(Cart cart) {
		
		return cartDao.update_size(cart);
	}

	@Override
	public int delete(Cart cart) {
		
		return cartDao.delete(cart);
	}

	@Override
	public List<Cart> cartProductAll(String u_id) {
		
		return cartDao.cartProductAll(u_id);
	}

	@Override
	public Integer count_product_by_userId(Cart cart) {
		
		return cartDao.count_product_by_userId(cart);
	}

	@Override
	public int update_byProductNo(Cart cart) {
		
		return cartDao.update_byProductNo(cart);
	}

	@Override
	public Cart findCartbyNo(Cart cart) {
		
		return cartDao.findCartbyNo(cart);
	}

	
	
}
