package tr.com.yd.tabak.managed.bean.view;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import tr.com.yd.tabak.domain.entity.User;
import tr.com.yd.tabak.faces.YDLazyDataModel;
import tr.com.yd.tabak.service.user.UserService;

@ManagedBean(name = "userManagedBean")
@ViewScoped
public class UserManagedBean {
	
	@ManagedProperty("#{userService}")
	private UserService userService;
	
	private YDLazyDataModel<Class<User>, UserService> userLazyDataModel;
	
	private User selectedUser;
	
	private User newUser;
	
	@PostConstruct
	public void init(){
		userLazyDataModel = new YDLazyDataModel<Class<User>, UserService>(User.class, getUserService());
		selectedUser = new User();
	}
	
	public void saveUser(){
		getUserService().saveOrUpdate(newUser);
	}
	
	public void addUser(){
		setNewUser(new User());
		getNewUser().setDeleted(Boolean.FALSE);
	}
	
	public void deleteUser(){
		setNewUser(getSelectedUser());
		getUserService().delete(getNewUser());
	}
	
	public void updateUser(){
		setNewUser(getSelectedUser());
	}
	
	//GETTER AND SETTER
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public YDLazyDataModel<Class<User>, UserService> getUserLazyDataModel() {
		return userLazyDataModel;
	}

	public void setUserLazyDataModel(YDLazyDataModel<Class<User>, UserService> userLazyDataModel) {
		this.userLazyDataModel = userLazyDataModel;
	}

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

	public User getNewUser() {
		return newUser;
	}

	public void setNewUser(User newUser) {
		this.newUser = newUser;
	}
}
