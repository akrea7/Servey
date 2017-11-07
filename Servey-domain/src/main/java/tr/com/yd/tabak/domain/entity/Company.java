package tr.com.yd.tabak.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
@SequenceGenerator(name = "seqGenerator", sequenceName = "COMPANY_SEQ", allocationSize = 1)
public class Company extends BaseEntity{

	@Column(name="COMPANY_NAME")
	private String companyName;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	//GETTER AND SETTER
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
