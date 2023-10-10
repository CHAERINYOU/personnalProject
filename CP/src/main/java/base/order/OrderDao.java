package base.order;

import java.util.List;

public interface OrderDao {

	int deleteU_id(String userid) throws Exception;

	int delete(Order order) throws Exception;

	int insertOrder(Order order) throws Exception;

	List<Order> selectByUserId(String userid) throws Exception;

	List<Order> selectOrderWithOrderItemsByOrderNo(int orderno) throws Exception;

	List<Order> selectOrderWithOrderItemsByUserId(String userid) throws Exception;

}
