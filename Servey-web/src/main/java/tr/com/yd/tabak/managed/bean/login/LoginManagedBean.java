package tr.com.yd.tabak.managed.bean.login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import tr.com.yd.tabak.domain.entity.User;
import tr.com.yd.tabak.managed.session.SessionUser;
import tr.com.yd.tabak.service.user.UserService;
import tr.com.yd.tabak.service.util.SecurityUtil;

@ManagedBean(name = "loginManagedBean")
@ViewScoped
public class LoginManagedBean {

	@ManagedProperty("#{sessionUser}")
	private SessionUser sessionUser;
	
	@ManagedProperty("#{userService}")
	private UserService userService;
	
	@ManagedProperty("#{securityUtil}")
	private SecurityUtil securityUtil;

	private String username;
	private String password;

	public String doLogin() {

		User user = getUserService().getUserByUserName(username);
		if (user == null) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Hata!", "Kullanýcý bulunamadý!"));
			return null;
		}

		// Check Password
		String encryptedPassword = getSecurityUtil().encrypt(password);
		if (user.getPassword().equals(encryptedPassword)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Hoþ Geldiniz!", user.getUserName()));
			getSessionUser().setUser(user);
			return "/template/index.xhtml";
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Hata!", "Þifre yanlýþ!"));
		}

		return null;
	}

	public String doLogout(){
		//getSessionUser().setKullanici(null);
		return "/template/login.xhtml";
	}

	// GETTER & SETTER
	public SessionUser getSessionUser() {
		return sessionUser;
	}

	public void setSessionUser(SessionUser sessionUser) {
		this.sessionUser = sessionUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public SecurityUtil getSecurityUtil() {
		return securityUtil;
	}

	public void setSecurityUtil(SecurityUtil securityUtil) {
		this.securityUtil = securityUtil;
	}
	
	
	
	
}
