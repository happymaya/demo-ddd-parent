package cn.happymaya.ddp.supplier.dao;


import cn.happymaya.ddp.supplier.entity.Supplier;

import java.util.Collection;
import java.util.List;

/**
 * The interface of supplier dao.
 * @author superhsc
 */
public interface SupplierDao {

	/**
	 * insert a supplier
	 * @param supplier supplier
	 */
	public void insertSupplier(Supplier supplier);

	/**
	 * update a supplier
	 * @param supplier supplier
	 */
	public void updateSupplier(Supplier supplier);

	/**
	 * @param id id
	 * @return
	 */
	public Supplier getSupplier(String id);
	
	/**
	 * @return supplier of collection
	 */
	public Collection<Supplier> listOfSuppliers();
}
