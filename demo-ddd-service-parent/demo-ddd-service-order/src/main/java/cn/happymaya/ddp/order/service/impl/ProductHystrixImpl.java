package cn.happymaya.ddp.order.service.impl;

import cn.happymaya.ddp.order.entity.Product;
import cn.happymaya.ddp.order.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author superhsc
 */
@Component
public class ProductHystrixImpl implements ProductService {
	private final static String DEFAULT_IMAGE = "/static/img/default.jpg";
	private final static Product DEFAULT_PRODUCT
		= new Product(null, "未知产品", null, null, null, null, DEFAULT_IMAGE, null, null);

	@Override
	public Product getProduct(Long id) {
		return DEFAULT_PRODUCT;
	}

	@Override
	public List<Product> getProductList(String ids) {
		List<Product> rtn = new ArrayList<>();
		rtn.add(DEFAULT_PRODUCT);
		return rtn;
	}

}
