package tr.com.yd.tabak.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
@SequenceGenerator(name = "seqGenerator", sequenceName = "CATEGORY_SEQ", allocationSize = 1)
public class Category extends BaseEntity{
	
	@ManyToOne()
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	//GETTER AND SETTER
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}
