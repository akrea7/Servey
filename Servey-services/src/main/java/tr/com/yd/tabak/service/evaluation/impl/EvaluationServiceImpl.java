package tr.com.yd.tabak.service.evaluation.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.evaluation.EvaluationDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.evaluation.EvaluationService;

@Transactional
@Service("evaluationService")
public class EvaluationServiceImpl extends BaseServiceImpl<EvaluationDao> implements EvaluationService {

}
