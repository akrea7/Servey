package tr.com.yd.tabak.service.serveyresultdetails.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.serveyresultdetails.ServeyResultDetailsDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.serveyresultdetails.ServeyResultDetailsService;

@Transactional
@Service("serveyResultDetailsService")
public class ServeyResultDetailsServiceImpl extends BaseServiceImpl<ServeyResultDetailsDao> implements ServeyResultDetailsService{

}
