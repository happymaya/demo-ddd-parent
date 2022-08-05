package cn.happymaya.ddp.order.service;

import cn.happymaya.ddp.order.entity.Address;
import cn.happymaya.ddp.order.entity.Customer;
import cn.happymaya.ddp.order.service.impl.CustomerHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * The service of customer
 * @author superhsc
 */
@FeignClient(value="service-customer", fallback= CustomerHystrixImpl.class)
public interface CustomerService {
	/**
	 * @param id the id of customer
	 * @return the customer by id.
	 */
	@GetMapping("orm/customer/load")
	public Customer load(@RequestParam("id")long id);
	/**
	 * @param ids the list of ids of customers
	 * @return the list of customers by ids
	 */
	@GetMapping("orm/customer/loadMore")
	public List<Customer> loadMore(@RequestParam("ids") String ids);
	/**
	 * @param id the id of address
	 * @return the address by id
	 */
	@GetMapping("orm/customer/loadAddress")
	public Address loadAddress(@RequestParam("id")long id);
	/**
	 * @param ids the list of ids of the addresses
	 * @return the list of addresses
	 */
	@GetMapping("orm/customer/loadAddresses")
	public List<Address> loadAddresses(@RequestParam("ids") String ids);
}
