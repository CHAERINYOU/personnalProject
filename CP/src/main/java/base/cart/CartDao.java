package base.cart;

import java.util.List;

public interface CartDao {
		
		// 카트 생성
		public int create(Cart cart);
		
		// 카트(수량) 업데이트
		public int update_qty(Cart cart);
		
		
		public int update_size(Cart cart);
		
		// 카트 삭제
		public int delete(Cart cart);
		
		// 카트 내 상품전체검색
		public List<Cart> cartProductAll(String u_id);
		
		// 유저아이디로 상품 수량카운트
		public Integer count_product_by_userId(Cart cart);
		
		// 상품번호 업데이트
		public int update_byProductNo(Cart cart);
		
		// 카트번호로 카트 찾기
		public Cart findCartbyNo(Cart cart);
		
}
