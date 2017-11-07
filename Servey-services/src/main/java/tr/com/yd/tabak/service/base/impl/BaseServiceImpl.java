package tr.com.yd.tabak.service.base.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.tabak.dao.base.BaseDao;
import tr.com.yd.tabak.domain.entity.BaseEntity;
import tr.com.yd.tabak.service.base.BaseService;

public class BaseServiceImpl<A extends BaseDao> implements BaseService {

	@Autowired
	private A dao;

	public List<BaseEntity> lazyLoad(int first, int pageSize, String sortField, boolean sortOrder, Map<String, Object> filters, Class clazz) {
		return dao.getLazyDataLoad(first, pageSize, sortField, sortOrder, filters, clazz);
	}

	public int getRowCount(Class clazz) {
		return dao.getTableRowCount(clazz);
	}

	@Override
	public BaseEntity saveOrUpdate(BaseEntity baseEntity) {
		// TODO Auto-generated method stub
		return dao.insert(baseEntity);
	}

	@Override
	public BaseEntity update(BaseEntity baseEntity) {
		// TODO Auto-generated method stub
		return dao.update(baseEntity);
	}

	@Override
	public void delete(BaseEntity baseEntity) {
		// TODO Auto-generated method stub
		dao.delete(baseEntity);
	}

}
