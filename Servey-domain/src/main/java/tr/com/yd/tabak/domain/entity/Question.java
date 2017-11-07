package tr.com.yd.tabak.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="QUESTION")
@SequenceGenerator(name = "seqGenerator", sequenceName = "QUESTION_SEQ", allocationSize = 1)
public class Question extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	
	@Column(name="QUESTION_SENTENCE")
	private String questionSentence;

	
	//GETTER AND SETTER
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getQuestionSentence() {
		return questionSentence;
	}

	public void setQuestionSentence(String questionSentence) {
		this.questionSentence = questionSentence;
	}
	
	

}
