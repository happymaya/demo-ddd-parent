package cn.happymaya.ddp.support.repository;

import cn.happymaya.ddp.support.dao.BasicDao;
import cn.happymaya.ddp.support.dao.impl.factory.Join;
import cn.happymaya.ddp.support.dao.impl.factory.Ref;
import cn.happymaya.ddp.support.dao.impl.factory.VObj;
import cn.happymaya.ddp.support.dao.impl.factory.VObjFactory;
import cn.happymaya.ddp.support.entity.Entity;
import cn.happymaya.ddp.support.entity.ResultSet;
import cn.happymaya.ddp.support.exception.QueryException;
import cn.happymaya.ddp.support.service.impl.QueryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * The implement of the query service that 
 * it autofill each of the object property of the item of the query result set, like this:
 * fill the addresses with each the customer of the result set.
 * @author superhsc
 */
public class AutofillQueryServiceImpl extends QueryServiceImpl {
	private BasicDao dao;
	/**
	 * @return the dao
	 */
	public BasicDao getDao() {
		if(dao==null) throw new QueryException("The dao is null");
		return dao;
	}
	/**
	 * @param dao the dao to set
	 */
	public void setDao(BasicDao dao) {
		this.dao = dao;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected ResultSet afterQuery(Map<String, Object> params, ResultSet resultSet) {
		//if no result, do nothing.
		List<?> list = resultSet.getData();
		if(list==null||list.isEmpty())
			return super.afterQuery(params, resultSet);
		
		//if the value object hasn't any join, do nothing.
		Object firstOfVo = list.get(0);
		
		//auto fill value objects for each joins.
		List<Join> listOfJoins = listOfJoins(firstOfVo);
		if(listOfJoins!=null&&!listOfJoins.isEmpty()) {
			for(Join join : listOfJoins) {
				//TODO have exception
				autoFillJoin((List<Entity<Serializable>>)list, join);
			}
		}
		
		List<Ref> listOfRefs = listOfRefs(firstOfVo);
		if(listOfRefs!=null&&!listOfRefs.isEmpty()) {
			for(Ref ref : listOfRefs) {
				//TODO have exception
				autoFillRef((List<Entity<Serializable>>)list, ref);
			}
		}
		
		return super.afterQuery(params, resultSet);
	}
	
	/**
	 * list all the joins in the value object.
	 * @param vo the value object
	 * @return the list of joins
	 */
	private List<Join> listOfJoins(Object vo) {
		VObj vObj = VObjFactory.getVObj(vo.getClass().getName());
		return vObj.getJoins();
	}
	
	/**
	 * list all the refs in the value object.
	 * @param vo the value object
	 * @return the list of joins
	 */
	private List<Ref> listOfRefs(Object vo) {
		VObj vObj = VObjFactory.getVObj(vo.getClass().getName());
		return vObj.getRefs();
	}
	
	/**
	 * autofill all the joins in the value object.
	 * @param list
	 * @param join
	 */
	private <S extends Serializable, T extends Entity<S>> void autoFillJoin(List<T> list, Join join) {
		if(list==null||list.isEmpty()||join==null) return;
		GenericEntityFactoryForList<S, T> factory = new GenericEntityFactoryForList<>();
		factory.build(join, list, getDao());
	}
	
	@Autowired
	private ApplicationContext context;
	
	/**
	 * auto fill all of the joins in the value object.
	 * @param list
	 * @param ref
	 */
	private <S extends Serializable, T extends Entity<S>> void autoFillRef(List<T> list, Ref ref) {
		if(list==null||list.isEmpty()||ref==null) return;
		ReferenceFactoryForList<S, T> factory = new ReferenceFactoryForList<>(context);
		factory.build(ref, list);
	}
}
