package com.niit.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CartItemsDao;
import com.niit.model.CartItems;

@Repository(value="cartItemsDao")
@EnableTransactionManagement
@Transactional
public class CartItemsDaoImpl implements CartItemsDao {
	@Autowired
	SessionFactory sessionFactory;
	public CartItemsDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	public boolean saveorupdate(CartItems cartitems) {
		sessionFactory.getCurrentSession().saveOrUpdate(cartitems);
		return true;
	}
	public boolean delete(CartItems cartitems) {
		sessionFactory.getCurrentSession().delete(cartitems);
		return true;
	}
	public CartItems get(String id) {
		String q1="from CartItems where CartItems_id='"+id+"'";
		Query w=sessionFactory.getCurrentSession().createQuery(q1);
		List<CartItems>list =(List<CartItems>) w.list();//typecasting
		if(list==null||list.isEmpty())
		{
			return null;
		}
		
		return list.get(0);
		
	}
	public List<CartItems> list() {
		List<CartItems> cartitems=(List<CartItems>)
				sessionFactory.getCurrentSession().createCriteria(CartItems.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return cartitems;
		
	}
	

}
