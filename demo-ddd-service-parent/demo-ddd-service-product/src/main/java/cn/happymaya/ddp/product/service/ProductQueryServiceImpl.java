package cn.happymaya.ddp.product.service;

import cn.happymaya.ddp.product.entity.Product;
import cn.happymaya.ddp.product.entity.Supplier;
import cn.happymaya.ddp.support.entity.ResultSet;
import cn.happymaya.ddp.support.service.impl.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * The implement of the query service for products.
 * @author superhsc
 */
public class ProductQueryServiceImpl extends QueryServiceImpl {
	@Autowired
	private SupplierService supplierService;

	@Override
	protected ResultSet afterQuery(Map<String, Object> params,
								   ResultSet resultSet) {
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>)resultSet.getData();
		for(Product product : list) {
			Long supplierId = product.getSupplierId();
			Supplier supplier = supplierService.loadSupplier(supplierId);
			product.setSupplier(supplier);
		}
		resultSet.setData(list);
		return resultSet;
	}
	
}
