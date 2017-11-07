package tr.com.yd.tabak.service.base;

import java.util.List;
import java.util.Map;

import tr.com.yd.tabak.domain.entity.BaseEntity;

public interface BaseService {

	List<BaseEntity> lazyLoad(int first, int pageSize, String sortField, boolean sortOrder, Map<String, Object> filters,Class clazz);
	
	int getRowCount(Class clazz);
	
	BaseEntity saveOrUpdate(BaseEntity baseEntity);
	
	BaseEntity update(BaseEntity baseEntity);
	
	void delete(BaseEntity baseEntity);

}
