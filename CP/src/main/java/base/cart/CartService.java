package base.cart;

import java.util.List;

public interface CartService {

	// 카트에 담긴 상품 수량 변경
	public int update_qty(Cart cart);

	// 카트에 담긴 상품 사이즈 변경
	public int update_size(Cart cart);

	// 카트에 담긴 상품 전체보기
	public List<Cart> cartProductAll(String u_id);

	// 카트에 담긴 상품 삭제
	public int delete(Cart cart);

	// 카트에 상품 추가
	public int addCart(Cart cart);

	// 카트를 번호 아이디로 찾기
	public Cart findCartByIdWithNo(Cart cart);

}
