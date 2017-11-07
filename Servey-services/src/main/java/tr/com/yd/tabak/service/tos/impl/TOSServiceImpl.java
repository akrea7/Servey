package tr.com.yd.tabak.service.tos.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.tos.TOSDao;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.tos.TOSService;

@Transactional
@Service("TOSService")
public class TOSServiceImpl extends BaseServiceImpl<TOSDao> implements TOSService{

}
