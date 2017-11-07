package tr.com.yd.tabak.dao.base;

import java.util.List;
import java.util.Map;

import tr.com.yd.tabak.domain.entity.BaseEntity;

public interface BaseDao{
	
	BaseEntity insert(BaseEntity baseEntity);
	
	BaseEntity update(BaseEntity baseEntity);
	
	void delete(BaseEntity baseEntity);
	
	List<BaseEntity>  getLazyDataLoad(int first, int pageSize, String sortField, boolean sortOrder, Map<String, Object> filters, Class clazz);

	int getTableRowCount(Class clazz);
}
