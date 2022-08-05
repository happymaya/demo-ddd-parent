package cn.happymaya.ddp.order.entity;


import cn.happymaya.ddp.support.entity.Entity;

/**
 * The supplier entity
 * @author superhsc
 */
public class Supplier extends Entity<Long> {
	private static final long serialVersionUID = 1486267798991452251L;
	private Long id;
	private String name;
	
	public Supplier() { super(); }
	public Supplier(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	/**
	 * @return the id
	 */
	@Override
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	@Override
	public void setId(Long id) {
		this.id = (Long)id;
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
	
}
