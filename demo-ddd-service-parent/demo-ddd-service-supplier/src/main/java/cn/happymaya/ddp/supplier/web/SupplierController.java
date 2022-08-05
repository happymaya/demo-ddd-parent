package cn.happymaya.ddp.supplier.web;

import cn.happymaya.ddp.supplier.entity.Supplier;
import cn.happymaya.ddp.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * The orm controller for suppliers.
 * @author superhsc
 */
@RestController
@RequestMapping("supplier")
public class SupplierController {

	@Autowired
	private SupplierService service;

	@PostMapping("add")
	public void add(Supplier supplier) {
		service.createSupplier(supplier);
	}

	@PostMapping("modify")
	public void modify(Supplier supplier) {
		service.modifySupplier(supplier);
	}

	@GetMapping("load")
	public Supplier load(String id) {
		return service.loadSupplier(id);
	}

	@GetMapping("list")
	public Collection<Supplier> list() {
		return service.listOfSuppliers();
	}
}
