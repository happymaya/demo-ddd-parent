package cn.happymaya.ddp.supplier.service;


import cn.happymaya.ddp.supplier.entity.Supplier;

import java.util.Collection;

/**
 * The service of suppliers.
 * @author superhsc
 */
public interface SupplierService {

	/**
	 * create a supplier
	 * @param supplier supplier
	 */
	public void createSupplier(Supplier supplier);

	/**
	 * modify a certain supplier
	 * @param supplier supplier
	 */
	public void modifySupplier(Supplier supplier);

	/**
	 * @param id id
	 * @return the supplier
	 */
	public Supplier loadSupplier(String id);
	
	/**
	 * @return the list of suppliers
	 */
	public Collection<Supplier> listOfSuppliers();
}
