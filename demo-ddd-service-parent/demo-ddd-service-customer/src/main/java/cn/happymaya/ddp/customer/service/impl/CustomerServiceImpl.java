package cn.happymaya.ddp.customer.service.impl;


import cn.happymaya.ddp.customer.entity.Address;
import cn.happymaya.ddp.customer.entity.Customer;
import cn.happymaya.ddp.customer.service.CustomerService;
import cn.happymaya.ddp.support.dao.BasicDao;

import java.util.List;

/**
 * The implement of the customer service
 * @author superhsc
 */
public class CustomerServiceImpl implements CustomerService {

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
	public void save(Customer customer) {
		dao.insertOrUpdate(customer);
	}

	@Override
	public void delete(long id) {
		Customer customer = dao.load(id, new Customer());
		dao.delete(customer);
	}
	@Override
	public Customer load(long id) {
		Customer customer = new Customer();
		customer.setId(id);
		return dao.load(id, customer);
	}
	@Override
	public Address loadAddress(long id) {

		Address address = new Address();
		address.setId(id);
		return dao.load(id, address);
	}
	@Override
	public List<Customer> loadMore(List<Long> ids) {
		return dao.loadForList(ids, new Customer());
	}
	@Override
	public List<Address> loadAddresses(List<Long> ids) {
		return dao.loadForList(ids, new Address());
	}
}
