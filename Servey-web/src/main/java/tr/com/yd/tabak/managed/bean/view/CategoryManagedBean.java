package tr.com.yd.tabak.managed.bean.view;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import tr.com.yd.tabak.domain.entity.Category;
import tr.com.yd.tabak.faces.YDLazyDataModel;
import tr.com.yd.tabak.service.category.CategoryService;

@ManagedBean(name="categoryManagedBean")
@ViewScoped
public class CategoryManagedBean {
	
	@ManagedProperty("#{categoryService}")
	private CategoryService categoryService;

	private YDLazyDataModel<Class<Category>, CategoryService> categoryLazyDataModel;
	
	private Category selectedCategory;
	
	private Category newCategory;

	@PostConstruct
	public void init(){
		//TODO lazyLoad
		categoryLazyDataModel = new YDLazyDataModel<Class<Category>, CategoryService>(Category.class, getCategoryService());
	}

	public void saveCategory(){
		//TODO save
	}
	
	public void addCategory(){
		setNewCategory(new Category());
		
	}
	
	public void updateCategory(){
		setNewCategory(getSelectedCategory());
		
	}
	
	public void deleteCategory(){
	}
	
	
	//GETTER AND SETTER
	
	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public YDLazyDataModel<Class<Category>, CategoryService> getCategoryLazyDataModel() {
		return categoryLazyDataModel;
	}

	public void setCategoryLazyDataModel(YDLazyDataModel<Class<Category>, CategoryService> categoryLazyDataModel) {
		this.categoryLazyDataModel = categoryLazyDataModel;
	}

	public Category getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(Category selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	public Category getNewCategory() {
		return newCategory;
	}

	public void setNewCategory(Category newCategory) {
		this.newCategory = newCategory;
	}
	
}
