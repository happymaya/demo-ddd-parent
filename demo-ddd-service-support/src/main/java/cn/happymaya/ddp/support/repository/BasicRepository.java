package cn.happymaya.ddp.support.repository;


import cn.happymaya.ddp.support.entity.Entity;
import cn.happymaya.ddp.support.utils.BeanUtils;
import cn.happymaya.ddp.support.xml.XmlBuildFactoryTemplate;
import org.w3c.dom.Element;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author superhsc
 */
public abstract class BasicRepository<T extends Entity<S>, S extends Serializable> extends XmlBuildFactoryTemplate {

	private Map<S, T> map = new HashMap<>();
	private Class<T> clazz;
	
	/**
	 * @return clazz the clazz to get
	 */
	public Class<T> getClazz() {
		if(clazz==null) throw new RuntimeException("Please initialize the clazz in the constructor");
		return clazz;
	}

	/**
	 * @param clazz the clazz to set
	 */
	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	/**
	 * @param element element
	 */
	protected void loadBean(Element element) {
		try {
			T bean = clazz.newInstance();
			loadBean(element, bean);
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException("error when create products for factory!", e);
		}
	}
	
	/**
	 * @param element element
	 * @param bean bean
	 */
	private void loadBean(Element element, T bean) {
		Field[] fields = bean.getClass().getDeclaredFields();
		for(int i=0; i<fields.length; i++) {
			String fieldName = fields[i].getName();
			Class<?> type = fields[i].getType();
			String str = element.getAttribute(fieldName);
			if("".equals(str)) continue;
			Object value = BeanUtils.bind(type, str);
			BeanUtils.setValueByField(bean, fieldName, value);
		}
		save(bean);
	}
	
	/**
	 * @param bean bean
	 */
	public void insert(T bean) {
		save(bean);
	}
	
	/**
	 * @param bean bean
	 */
	public void update(T bean) {
		save(bean);
	}
	
	/**
	 * save the bean.
	 * @param bean bean
	 */
	public void save(T bean) {
		S id = bean.getId();
		map.put(id, bean);
	}
	
	/**
	 * delete by id.
	 * @param id id
	 */
	public void delete(S id) {
		map.remove(id);
	}
	
	/**
	 * @param id id
	 * @return get by id
	 */
	public T get(S id) {
		return map.get(id);
	}
	
	/**
	 * @return list all the values.
	 */
	public Collection<T> list() {
		return map.values();
	}
}
