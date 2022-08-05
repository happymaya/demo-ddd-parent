package cn.happymaya.ddp.product.service.impl;

import cn.happymaya.ddp.product.entity.Supplier;
import cn.happymaya.ddp.product.service.SupplierService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The supplier service fallback class.
 * @author fangang
 */
@Component
public class SupplierHystrixImpl implements SupplierService {
	private static Supplier DEFAULT_DATA = new Supplier((long)0, "默认供应商");

	@Override
	public Supplier loadSupplier(Long id) {
		Supplier supplier = (Supplier)DEFAULT_DATA.clone();
		supplier.setId(id);
		return supplier;
	}

	@Override
	public List<Supplier> loadSuppliers(String ids) {
		List<Supplier> list = new ArrayList<>();
		if(ids==null) return list;
		String[] idArray = ids.split(",");
		for(String id : idArray) {
			Supplier supplier = (Supplier)DEFAULT_DATA.clone();
			supplier.setId(new Long(id));
			list.add(supplier);
		}
		return list;
	}

}
