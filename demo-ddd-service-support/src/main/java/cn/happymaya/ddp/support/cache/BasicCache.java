package cn.happymaya.ddp.support.cache;


import cn.happymaya.ddp.support.entity.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * The basic cache used by ddd repository.
 * @see cn.happymaya.ddp.support.repository.Repository
 * @author superhsc
 */
public interface BasicCache {

	/**
	 * @param vo the value object
	 */
	public <S extends Serializable, T extends Entity<S>> void set(T vo);

	/**
	 * @param id id
	 * @param template template
	 * @return the value object
	 */
	public <S extends Serializable, T extends Entity<S>> T get(S id, T template);

	/**
	 * @param id id
	 * @param template template
	 */
	public <S extends Serializable, T extends Entity<S>> void delete(S id, T template);

	/**
	 * @param vos the list of value objects.
	 */
	public <S extends Serializable, T extends Entity<S>> void setForList(Collection<T> vos);

	/**
	 * @param ids the list of id
	 * @param template template
	 * @return the list of value objects
	 */
	public <S extends Serializable, T extends Entity<S>> Collection<T> getForList(Collection<S> ids, T template);

	/**
	 * @param ids the list of id
	 * @param template template
	 */
	public <S extends Serializable, T extends Entity<S>> void deleteForList(Collection<S> ids, T template);

	/**
	 * set a value to cache, that the value is a list.
	 * @param template template
	 * @param list list
	 */
	public <S extends Serializable, T extends Entity<S>> void setList(T template, List<T> list);

	/**
	 * @param template template
	 * @return get the value by id, that the value is a list.
	 */
	public <S extends Serializable, T extends Entity<S>> List<T> getList(T template);

	/**
	 * delete a value from cache, that the value is a list.
	 * @param template template
	 */
	public <S extends Serializable, T extends Entity<S>> void deleteList(T template);
}
