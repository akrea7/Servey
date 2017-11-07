package tr.com.yd.tabak.dao.user.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import tr.com.yd.tabak.dao.base.impl.BaseDaoImpl;
import tr.com.yd.tabak.dao.user.UserDao;
import tr.com.yd.tabak.domain.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	@Override
	public User getUserByUserName(String userName) {
		String hql = "select user from User user where user.userName = :userName";
        Query query = getSessionFactory().openSession().createQuery(hql);
        query.setParameter("userName", userName);
        return (User) query.uniqueResult();
	}

}
