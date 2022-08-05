package cn.happymaya.ddp.supplier.dao;

import cn.happymaya.ddp.supplier.dao.impl.SupplierRepository;
import cn.happymaya.ddp.support.dao.QueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author superhsc
 */
@Repository
public class SupplierQueryDao implements QueryDao {


	@Override
	public List<?> query(Map<String, Object> params) {
		return null;
	}

	@Override
	public long count(Map<String, Object> params) {
		return 0;
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		return null;
	}
}
