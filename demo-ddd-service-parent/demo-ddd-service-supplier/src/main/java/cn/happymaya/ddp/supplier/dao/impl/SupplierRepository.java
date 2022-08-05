package cn.happymaya.ddp.supplier.dao.impl;

import cn.happymaya.ddp.supplier.dao.SupplierDao;
import cn.happymaya.ddp.supplier.entity.Supplier;
import cn.happymaya.ddp.support.repository.BasicRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author superhsc
 */
@Repository
public class SupplierRepository extends BasicRepository<Supplier, String> implements SupplierDao {

	public SupplierRepository() {
		setClazz(Supplier.class);
		initFactory("supplier.xml");
	}

	@Override
	public void insertSupplier(Supplier supplier) {
		super.save(supplier);
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		super.save(supplier);
	}

	@Override
	public Supplier getSupplier(String id) {
		return super.get(id);
	}

	@Override
	public Collection<Supplier> listOfSuppliers() {
		return super.list();
	}

}
