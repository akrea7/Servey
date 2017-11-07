package tr.com.yd.tabak.service.company.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.company.CompanyDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.company.CompanyService;
@Transactional
@Service("companyService")
public class CompanyServiceImpl extends BaseServiceImpl<CompanyDao> implements CompanyService{

}
