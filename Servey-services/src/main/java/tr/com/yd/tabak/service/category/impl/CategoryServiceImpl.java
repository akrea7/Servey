package tr.com.yd.tabak.service.category.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.category.CategoryDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.category.CategoryService;

@Transactional
@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<CategoryDao> implements CategoryService {

	
}
