package tr.com.yd.tabak.managed.bean.view;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.view.ViewScoped;

import tr.com.yd.tabak.domain.entity.Question;
import tr.com.yd.tabak.faces.YDLazyDataModel;
import tr.com.yd.tabak.service.question.QuestionService;

@ManagedBean(name="questionManagedBean")
@ViewScoped
public class QuestionManagedBean {
	
	@ManagedProperty("#{questionService}")
	private QuestionService questionService;
	
	private YDLazyDataModel<Class<Question>, QuestionService> questionLazyDataModel;
	
	private Question selectedQuestion;
	
	private Question newQuestion;
	
	@PostConstruct
	public void init(){
		
	}
	
	public void saveQuestion(){
		
	}
	public void addQuestion(){
		setNewQuestion(new Question());
	}
	public void updateQuestion(){
		setNewQuestion(getSelectedQuestion());
	}
	public void deleteQuestion(){
	}

	
	//GETTER AND SETTER
	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public YDLazyDataModel<Class<Question>, QuestionService> getQuestionLazyDataModel() {
		return questionLazyDataModel;
	}

	public void setQuestionLazyDataModel(YDLazyDataModel<Class<Question>, QuestionService> questionLazyDataModel) {
		this.questionLazyDataModel = questionLazyDataModel;
	}

	public Question getSelectedQuestion() {
		return selectedQuestion;
	}

	public void setSelectedQuestion(Question selectedQuestion) {
		this.selectedQuestion = selectedQuestion;
	}

	public Question getNewQuestion() {
		return newQuestion;
	}

	public void setNewQuestion(Question newQuestion) {
		this.newQuestion = newQuestion;
	}
	
	

}
