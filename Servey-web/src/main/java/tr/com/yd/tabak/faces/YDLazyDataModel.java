package tr.com.yd.tabak.faces;

import java.util.List;
import java.util.Map;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;

import tr.com.yd.tabak.domain.entity.BaseEntity;
import tr.com.yd.tabak.service.base.BaseService;

public class YDLazyDataModel<T extends Class,S extends BaseService> extends LazyDataModel<BaseEntity>{

	private T clazz;
	private S service;

	public YDLazyDataModel(T clazz,S service){
		this.clazz = clazz;
		this.service = service;
	}

	@Override
	public List<BaseEntity> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		setRowCount(this.service.getRowCount(clazz));
		return this.service.lazyLoad(first, pageSize, sortField, SortOrder.ASCENDING.equals(sortOrder), filters, clazz);
	}

}
