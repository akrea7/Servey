package tr.com.yd.tabak.managed.bean.view;


import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import tr.com.yd.tabak.domain.entity.Company;
import tr.com.yd.tabak.faces.YDLazyDataModel;
import tr.com.yd.tabak.service.company.CompanyService;

@ManagedBean(name="companyManagedBean")
@ViewScoped
public class CompanyManagedBean {
	
	@ManagedProperty("#{companyService}")
	private CompanyService companyService;
	
	private YDLazyDataModel<Class<Company>, CompanyService> companyLazyDataModel;
	
	private Company selectedCompany;
	
	private Company newCompany;
	
	@PostConstruct
	public void init(){
		//TODO servisler yazýlýnca bakýlacak
	}
	
	public void saveCategory(){
		//TODO kayýt edilen data dataModele ekle idli halini
	}
	public void addCompany(){
		setNewCompany(new Company());
	}
	public void updateCategory(){
		setNewCompany(getSelectedCompany());
	}
	
	public void deleteCategory(){
	}
	
	
	//GETTER AND SETTER
	public CompanyService getCompanyService() {
		return companyService;
	}

	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}

	public YDLazyDataModel<Class<Company>, CompanyService> getCompanyLazyDataModel() {
		return companyLazyDataModel;
	}

	public void setCompanyLazyDataModel(YDLazyDataModel<Class<Company>, CompanyService> companyLazyDataModel) {
		this.companyLazyDataModel = companyLazyDataModel;
	}

	public Company getSelectedCompany() {
		return selectedCompany;
	}

	public void setSelectedCompany(Company selectedCompany) {
		this.selectedCompany = selectedCompany;
	}

	public Company getNewCompany() {
		return newCompany;
	}

	public void setNewCompany(Company newCompany) {
		this.newCompany = newCompany;
	}

	
}
