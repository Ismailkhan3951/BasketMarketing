package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import com.niit.dao.OrderItemsDao;
import com.niit.model.Order;
import com.niit.model.OrderItems;
import com.niit.model.Product;
@Repository("orderItemsDao")
@EnableTransactionManagement
@Transactional

public class OrderItemsDaoImpl implements OrderItemsDao{
	@Autowired
	SessionFactory sessionFactory;
	public OrderItemsDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean saveorupdate(OrderItems orderitems) {
		sessionFactory.getCurrentSession().saveOrUpdate(orderitems);
		return true;
	}
	@Transactional
	public boolean delete(OrderItems orderitems) {
		sessionFactory.getCurrentSession().delete(orderitems);
		return true;
	}
	@Transactional
	public OrderItems get(String id) {
		String q1="from OrderItems where OrderItem_id='"+id+"'";
		Query w=sessionFactory.getCurrentSession().createQuery(q1);
		List<OrderItems>list =(List<OrderItems>) w.list();//typecasting
		if(list==null||list.isEmpty())
		{
			return null;
		}
		
		return list.get(0);
		
	}
	@Transactional
	public List<OrderItems> list() {
		List<OrderItems> orderitems=(List<OrderItems>)
				sessionFactory.getCurrentSession().createCriteria(OrderItems.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return orderitems;
		
	}
	


}
