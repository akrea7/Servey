package tr.com.yd.tabak.managed.bean.view;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import tr.com.yd.tabak.domain.entity.TOS;
import tr.com.yd.tabak.faces.YDLazyDataModel;
import tr.com.yd.tabak.service.tos.TOSService;

@ManagedBean(name="tosManagedBean")
@ViewScoped
public class TOSManagedBean {

	@ManagedProperty("#{tosService}")
	private TOSService tosService;

	private YDLazyDataModel<Class<TOS>, TOSService> tosLazyDataModel;

	private TOS selectedTOS;

	private TOS newTOS;

	@PostConstruct
	public void init(){

	}
	public void saveQuestion(){

	}
	public void addQuestion(){
		setNewTOS(new TOS());
	}
	public void updateQuestion(){
		setNewTOS(getSelectedTOS());
	}
	public void deleteQuestion(){
	}

	//GETTER AND SETTER
	public TOSService getTosService() {
		return tosService;
	}

	public void setTosService(TOSService tosService) {
		this.tosService = tosService;
	}

	public YDLazyDataModel<Class<TOS>, TOSService> getTosLazyDataModel() {
		return tosLazyDataModel;
	}

	public void setTosLazyDataModel(YDLazyDataModel<Class<TOS>, TOSService> tosLazyDataModel) {
		this.tosLazyDataModel = tosLazyDataModel;
	}

	public TOS getSelectedTOS() {
		return selectedTOS;
	}

	public void setSelectedTOS(TOS selectedTOS) {
		this.selectedTOS = selectedTOS;
	}

	public TOS getNewTOS() {
		return newTOS;
	}

	public void setNewTOS(TOS newTOS) {
		this.newTOS = newTOS;
	}



}
