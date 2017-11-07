package tr.com.yd.tabak.service.servey.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.servey.ServeyDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.servey.ServeyService;

@Transactional
@Service("serveyService")
public class ServeyServiceImpl extends BaseServiceImpl<ServeyDao> implements ServeyService{

}
