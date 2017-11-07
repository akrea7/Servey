package tr.com.yd.tabak.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SERVEY_RESULT")
@SequenceGenerator(name = "seqGenerator", sequenceName = "SERVEY_RESULT_SEQ", allocationSize = 1)
public class ServeyResultDetails extends BaseEntity {

	@ManyToOne
	@JoinColumn(name="EVALUATION_ID")
	private Evaluation evaluation;
	
	@OneToMany
	private List<TOS> tosList;
	
	@ManyToOne
	@JoinColumn(name="QUESTION_ID")
	private Question question;

	//GETTER AND SETTER
	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public List<TOS> getTosList() {
		return tosList;
	}

	public void setTosList(List<TOS> tosList) {
		this.tosList = tosList;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
