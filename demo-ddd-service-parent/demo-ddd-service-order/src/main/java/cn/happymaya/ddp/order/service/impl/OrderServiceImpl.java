package cn.happymaya.ddp.order.service.impl;


import cn.happymaya.ddp.order.entity.Order;
import cn.happymaya.ddp.order.service.OrderService;
import cn.happymaya.ddp.support.dao.BasicDao;

import java.util.List;

/**
 * @author superhsc
 */
public class OrderServiceImpl implements OrderService {
	private BasicDao dao;

	/**
	 * @return the dao
	 */
	public BasicDao getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(BasicDao dao) {
		this.dao = dao;
	}

	@Override
	public void createOrder(Order order) {
		dao.insert(order);
	}

	@Override
	public void modifyOrder(Order order) {
		dao.update(order);
	}

	@Override
	public void deleteOrder(Order order) {
		dao.delete(order);
	}

	@Override
	public Order checkOrder(Long id) {
		return dao.load(id, new Order());
	}

	@Override
	public List<Order> listOfOrders() {
		return dao.loadAll(new Order());
	}

}
