package tr.com.yd.tabak.dao.base.impl;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.tabak.domain.entity.BaseEntity;

public class BaseDaoImpl{

	@Autowired
	private SessionFactory sessionFactory;


	public BaseEntity insert(BaseEntity baseEntity) {

		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(baseEntity);
		transaction.commit();
		session.close();
		return baseEntity;
	}

	public BaseEntity update(BaseEntity baseEntity) {
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(baseEntity);
		transaction.commit();
		session.close();
		return baseEntity;
	}


	public void delete(BaseEntity baseEntity) {
		baseEntity.setDeleted(Boolean.TRUE);
		Session session = getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(baseEntity);
		transaction.commit();
		session.close();
	}

	public List<BaseEntity> getLazyDataLoad(int first, int pageSize, String sortField, boolean sortOrder, Map<String, Object> filters, Class clazz) {
		Criteria criteria = getSessionFactory().openSession().createCriteria(clazz);
		criteria.setFirstResult(first);
		criteria.setMaxResults(pageSize);
		if (sortField != null) {
			if (sortOrder)
				criteria.addOrder(org.hibernate.criterion.Order.asc(sortField));
			else
				criteria.addOrder(org.hibernate.criterion.Order.desc(sortField));
		}
		for (Map.Entry<String, Object> entry : filters.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			criteria.add(Restrictions.like(key, value.toString(), MatchMode.ANYWHERE));
		}
		List<BaseEntity> list = criteria.list();
		return list;
	}
	
	public int getTableRowCount(Class clazz) {
		return (int) getSessionFactory().openSession().createCriteria(clazz).setProjection(Projections.rowCount()).uniqueResult();
	}



	//GETTER AND SETTER
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}

