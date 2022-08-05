package cn.happymaya.ddp.support.dao;


import cn.happymaya.ddp.support.entity.Entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * The basic dao for generic insert, update, delete operations.
 * @author superhsc
 */
public interface BasicDao {

	/**
	 * insert an entity into table.
	 * @param entity entity
	 */
	<T> void insert(T entity);

	/**
	 * update an entity.
	 * @param entity entity
	 */
	<T> void update(T entity);

	/**
	 * if not exists, then insert, else update.
	 * @param entity entity
	 */
	<T> void insertOrUpdate(T entity);

	/**
	 * insert a list of value objects, and if exists, then update.
	 * @param list list
	 */
	<T, S extends Collection<T>> void insertOrUpdateForList(S list);

	/**
	 * delete an entity.
	 * note: you must load the entity first or do like this: 
	 * <pre>
	 * User user = new User();
	 * user.setId("C0001");
	 * dao.delete(user);
	 * </pre>
	 * @param entity entity
	 */
	<T> void delete(T entity);

	/**
	 * delete a list of value objects.
	 * @param list list
	 */
	<T, S extends Collection<T>> void deleteForList(S list);

	/**
	 * @param ids ids
	 * @param template template
	 */
	<S extends Serializable, T extends Entity<S>> void deleteForList(Collection<S> ids, T template);

	/**
	 * load an entity by id.
	 * @param id id
	 * @param template just an empty object to know which class
	 * @return entity
	 */
	<S extends Serializable, T extends Entity<S>> T load(S id, T template);

	/**
	 * load a list of entity by their ids.
	 * @param ids the list of id
	 * @param template just an empty object to know which class
	 * @return list of entity
	 */
	<S extends Serializable, T extends Entity<S>> List<T> loadForList(Collection<S> ids, T template);

	/**
	 * load all entities according to a condition, which the condition come from the template. 
	 * for example: I want to load all the items of an order, then the template is the orderItem
	 * and set the orderId to the 'orderId' column in the template. 
	 * Then it will load all the items of this order according to conditions in the template.
	 * @param template just an empty object to know which class, and set the condition to it.
	 * @return list of entities.
	 */
	<S extends Serializable, T extends Entity<S>> List<T> loadAll(T template);

	/**
	 * load all entities according to a condition, which the condition come from the list<map>, 
	 * such as: [{key:"col0",opt:'=',value:"val0"},{key:"col1",opt:'=',value:"val1"}]
	 * @param colMap calMap
	 * @param template template
	 * @return list of entities.
	 */
	<S extends Serializable, T extends Entity<S>> List<T> loadAll(List<Map<Object, Object>> colMap, T template);

	/**
	 * delete an entity by id.
	 * @param id id
	 * @param template just an empty object to know which class
	 */
	<S extends Serializable, T extends Entity<S>> void delete(S id, T template);


}
