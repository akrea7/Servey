package tr.com.yd.tabak.domain.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EVALAUTION")
@SequenceGenerator(name = "seqGenerator", sequenceName = "EVALAUTION_SEQ", allocationSize = 1)
public class Evaluation extends BaseEntity{

	@ManyToOne
	@JoinColumn(name="COMPANY_ID")
	private Company company;

	//GETTER AND SETTER
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
