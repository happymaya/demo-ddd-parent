/*
 * Created by 2021-01-04 15:40:35 
 */
package cn.happymaya.ddp.support.utils;

import com.demo2.support.entity.Entity;

import java.util.List;

/**
 * @author fangang
 */
public class Supplier extends Entity<Long> {
	private static final long serialVersionUID = -5594377045944691370L;
	private Long id;
	private String name;
	private List<Product> products;
	
	public Supplier() {
		super();
	}
	
	public Supplier(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
