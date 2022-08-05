package cn.happymaya.ddp.customer.entity;


import cn.happymaya.ddp.support.entity.Entity;

/**
 * @author superhsc
 */
public class Country extends Entity<Long> {
	private static final long serialVersionUID = 6234919102569211485L;
	private Long id;
	private String name;
	
	@Override
	public Long getId() {
		return this.id;
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
}
