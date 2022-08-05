package cn.happymaya.ddp.product.service;

import cn.happymaya.ddp.product.entity.Supplier;
import cn.happymaya.ddp.product.service.impl.SupplierHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * The service of suppliers.
 * @author superhsc
 */
@FeignClient(value="service-supplier", fallback= SupplierHystrixImpl.class)
public interface SupplierService {

	/**
	 * @param id the id of the supplier
	 * @return the supplier
	 */
	@GetMapping("orm/supplier/loadSupplier")
	public Supplier loadSupplier(@RequestParam("id")Long id);
	/**
	 * @param ids the list of ids of suppliers
	 * @return the list of suppliers by ids
	 */
	@GetMapping("orm/supplier/loadSuppliers")
	public List<Supplier> loadSuppliers(@RequestParam("ids") String ids);
}
