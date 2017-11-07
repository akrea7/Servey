package tr.com.yd.tabak.service.question.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.question.QuestionDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.question.QuestionService;

@Transactional
@Service("questionService")
public class QuestionServiceImpl extends BaseServiceImpl<QuestionDao> implements QuestionService{

}
