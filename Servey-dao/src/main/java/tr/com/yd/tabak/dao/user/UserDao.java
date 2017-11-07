package tr.com.yd.tabak.dao.user;

import tr.com.yd.tabak.dao.base.BaseDao;
import tr.com.yd.tabak.domain.entity.User;

public interface UserDao extends BaseDao{
	User getUserByUserName(String userName);
}
