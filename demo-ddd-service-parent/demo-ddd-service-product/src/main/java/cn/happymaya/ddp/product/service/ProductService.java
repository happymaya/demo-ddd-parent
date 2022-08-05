package cn.happymaya.ddp.product.service;


import cn.happymaya.ddp.product.entity.Product;

import java.util.List;

/**
 * The service for products.
 * @author superhsc
 */
public interface ProductService {
	/**
	 * save a product.
	 * @param product product
	 */
	public void saveProduct(Product product);
	/**
	 * save a list of products.
	 * @param listOfProducts list of products
	 */
	public void saveProductList(List<Product> listOfProducts);
	/**
	 * delete a product by id.
	 * @param id id
	 */
	public void deleteProduct(Long id);
	
	/**
	 * delete a list of products
	 * @param ids ids
	 */
	public void deleteProductList(List<Long> ids);
	/**
	 * get a product by id.
	 * @param id id
	 * @return a certain product.
	 */
	public Product getProduct(Long id);
	
	/**
	 * get a list of products by their id.
	 * @param ids ids
	 * @return a list of products
	 */
	public List<Product> getProductList(List<Long> ids);
}
