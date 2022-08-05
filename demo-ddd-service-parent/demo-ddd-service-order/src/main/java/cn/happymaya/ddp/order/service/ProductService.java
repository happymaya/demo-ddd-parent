package cn.happymaya.ddp.order.service;

import cn.happymaya.ddp.order.entity.Product;
import cn.happymaya.ddp.order.service.impl.ProductHystrixImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * The service for products.
 * @author superhsc
 */
@FeignClient(value="service-product", fallback= ProductHystrixImpl.class)
public interface ProductService {
	/**
	 * get a product by id.
	 * @param id id
	 * @return a certain product.
	 */
	@GetMapping("orm/product/getProduct")
	public Product getProduct(@RequestParam("id")Long id);
	
	/**
	 * get a list of products by their id.
	 * @param ids ids
	 * @return a list of products
	 */
	@PostMapping("orm/product/getProductList")
	public List<Product> getProductList(@RequestParam("ids") String ids);
}
