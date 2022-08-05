package cn.happymaya.ddp.order.service;


import cn.happymaya.ddp.order.entity.Order;

import java.util.List;

/**
 * @author superhsc
 */
public interface OrderService {
	/**
	 * @param order the order entity
	 */
	public void createOrder(Order order);
	/**
	 * @param order the order entity
	 */
	public void modifyOrder(Order order);
	/**
	 * @param order the order entity
	 */
	public void deleteOrder(Order order);
	/**
	 * @param id the id of the order
	 * @return check the order exists or not
	 */
	public Order checkOrder(Long id);
	/**
	 * @return list all of orders
	 */
	public List<Order> listOfOrders();
}
