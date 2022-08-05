package cn.happymaya.ddp.supplier.entity;

import cn.happymaya.ddp.support.entity.Entity;

/**
 * @author superhsc
 */
public class Supplier extends Entity<String> {

	private static final long serialVersionUID = 1509361006783434262L;
	private String id;
	private String name;
	private String classify;
	
	public Supplier() {}

	public Supplier(String id, String name, String classify) {
		this.id = id;
		this.name = name;
		this.classify = classify;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	 * @return to classify
	 */
	public String getClassify() {
		return classify;
	}

	/**
	 * @param classify to classify to set
	 */
	public void setClassify(String classify) {
		this.classify = classify;
	}
	
}
