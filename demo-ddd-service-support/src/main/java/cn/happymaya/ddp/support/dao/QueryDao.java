package cn.happymaya.ddp.support.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * The generate query dao
 * @author superhsc
 */
public interface QueryDao {

	/**
	 * execute query
	 * @param params the parameters the query need
	 * @return the result set of query
	 */
	Collection<?> query(Map<String, Object> params);

	/**
	 * get count of the query
	 * @param params the parameters the query need
	 * @return the count
	 */
	long count(Map<String, Object> params);

	/**
	 * execute aggregate such as sum, count, average, etc.
	 * @param params the parameters the query need
	 * @return the result of the aggregate
	 */
	Map<String, Object> aggregate(Map<String, Object> params);
}
