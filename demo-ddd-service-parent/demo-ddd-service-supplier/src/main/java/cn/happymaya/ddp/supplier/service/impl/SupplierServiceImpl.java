package cn.happymaya.ddp.supplier.service.impl;

import cn.happymaya.ddp.supplier.dao.SupplierDao;
import cn.happymaya.ddp.supplier.entity.Supplier;
import cn.happymaya.ddp.supplier.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * The implement of the supplier service.
 *
 * @author superhsc
 */
@Service("supplier")
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDao dao;

    @Override
    public void createSupplier(Supplier supplier) {
        dao.insertSupplier(supplier);
    }

    @Override
    public void modifySupplier(Supplier supplier) {
        dao.updateSupplier(supplier);
    }

    @Override
    public Supplier loadSupplier(String id) {
        return dao.getSupplier(id);
    }

    @Override
    public Collection<Supplier> listOfSuppliers() {
        return dao.listOfSuppliers();
    }
}
