package tr.com.yd.tabak.managed.session;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import tr.com.yd.tabak.domain.entity.User;
import tr.com.yd.tabak.managed.bean.application.ApplicationBean;
import tr.com.yd.tabak.service.user.UserService;

@ManagedBean(name = "sessionUser")
@SessionScoped
public class SessionUser {

	@ManagedProperty("#{applicationBean}")
	private ApplicationBean applicationBean;

	@ManagedProperty("#{userService}")
	private UserService userService;

	private String theme = "bootstrap";

	private Locale locale;

	private User user;

	@PostConstruct
	public void init() {
		setTheme(getApplicationBean().getDefaultTheme()); // TODO: if kullanici theme is null
		//        kullanici = getKullaniciService().getKullaniciByKullaniciAdi("12345678910"); //TODO: burasý statik olmayacak!
		//        birim = getBirimService().getBirimById(8105L); //TODO: burasý statik olmayacak!
	}

	public ApplicationBean getApplicationBean() {
		return applicationBean;
	}

	public void setApplicationBean(ApplicationBean applicationBean) {
		this.applicationBean = applicationBean;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Locale getLocale() {
		if (locale == null) {
			locale = new Locale("tr_TR");
		}
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



}
