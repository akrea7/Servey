package tr.com.yd.tabak.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.tabak.dao.user.UserDao;
import tr.com.yd.tabak.domain.entity.User;
import tr.com.yd.tabak.service.base.impl.BaseServiceImpl;
import tr.com.yd.tabak.service.user.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<UserDao> implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserByUserName(String userName) {
		return getUserDao().getUserByUserName(userName);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	

}
