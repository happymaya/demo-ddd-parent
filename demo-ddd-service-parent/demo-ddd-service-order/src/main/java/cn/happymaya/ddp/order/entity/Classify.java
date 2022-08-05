package cn.happymaya.ddp.order.entity;


import cn.happymaya.ddp.support.entity.Entity;

/**
 * @author superhsc
 */
public class Classify extends Entity<Long> {

	private static final long serialVersionUID = -3764029770647081900L;
	private Long id;
	private String name;
	private Long parent_id;

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
	 * @return the parentId
	 */
	public Long getParentId() {
		return parent_id;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(Long parentId) {
		this.parent_id = parentId;
	}

}
