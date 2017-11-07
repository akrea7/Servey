package tr.com.yd.tabak.service.user;

import tr.com.yd.tabak.domain.entity.User;
import tr.com.yd.tabak.service.base.BaseService;

public interface UserService extends BaseService{

	User getUserByUserName(String userName);
}
