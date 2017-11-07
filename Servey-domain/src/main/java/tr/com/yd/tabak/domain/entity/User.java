package tr.com.yd.tabak.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
@SequenceGenerator(name = "seqGenerator", sequenceName = "USER_SEQ", allocationSize = 2)
public class User extends BaseEntity{

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="USER_CODE")
	private String usercode;

	@Column(name="USER_SURNAME")
	private String userSurname;

	//GETTER AND SETTER
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
}
