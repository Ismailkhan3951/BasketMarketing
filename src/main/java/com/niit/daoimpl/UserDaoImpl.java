package com.niit.daoimpl;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDao;
import com.niit.model.Supplier;
import com.niit.model.User;
@Repository("userDao")
@EnableTransactionManagement
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	public UserDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional//when ever user says to save the data it will perform that action
	public boolean saveorupdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
	}

	@Transactional
	public boolean delete(User user) {
	  sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	@Transactional
	public User get(String id) {
		String q1="from User where user_id='"+id+"'";
		Query w=sessionFactory.getCurrentSession().createQuery(q1);
		List<User>list =(List<User>) w.list();//typecasting
		if(list==null||list.isEmpty())
		{
			return null;
		}
		
		return list.get(0);
	}

	@Transactional
	public List<User> list() {
		List<User> user=(List<User>)
				sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return user;
	}
	

}
