package base.cart;

import java.util.List;

public class CartServiceImpl implements CartService{
	
	private CartService cartService;
	
	@Override
	public int update_qty(Cart cart) {
		
		return cartService.update_qty(cart);
	}

	@Override
	public int update_size(Cart cart) {
		
		return cartService.update_qty(cart);
	}

	@Override
	public List<Cart> cartProductAll(String u_id) {
		
		return cartService.cartProductAll(u_id);
	}

	@Override
	public int delete(Cart cart) {
		
		return cartService.delete(cart);
	}

	@Override
	public int addCart(Cart cart) {
		
		return cartService.addCart(cart);
	}

	@Override
	public Cart findCartByIdWithNo(Cart cart) {
		
		return cartService.findCartByIdWithNo(cart);
	}

}
