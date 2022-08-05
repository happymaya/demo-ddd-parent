package cn.happymaya.ddp.customer.service;

import cn.happymaya.ddp.customer.entity.Address;
import cn.happymaya.ddp.customer.entity.Customer;

import java.util.List;

/**
 * The service of customer
 * @author superhsc
 */
public interface CustomerService {

	/**
	 * save a customer
	 * @param customer the customer entity
	 */
	public void save(Customer customer);

	/**
	 * delete a customer
	 * @param id the id of customer
	 */

	public void delete(long id);
	/**
	 * @param id the id of the customer
	 * @return the customer by id.
	 */

	public Customer load(long id);

	/**
	 * @param ids the list of ids
	 * @return the list of customers by ids
	 */
	public List<Customer> loadMore(List<Long> ids);

	/**
	 * @param id the id of the address
	 * @return the address by id
	 */
	public Address loadAddress(long id);

	/**
	 * @param ids the list of ids of the addresses
	 * @return the list of the addresses by ids
	 */
	public List<Address> loadAddresses(List<Long> ids);
}
