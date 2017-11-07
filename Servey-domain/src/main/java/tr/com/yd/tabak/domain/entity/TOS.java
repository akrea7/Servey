package tr.com.yd.tabak.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TOS")
@SequenceGenerator(name = "seqGenerator", sequenceName = "TOS_SEQ", allocationSize = 1)
public class TOS extends BaseEntity{
	
	@Column(name="DESCRIPTION")
	private String description;

	
	//GETTER AND SETTER
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
