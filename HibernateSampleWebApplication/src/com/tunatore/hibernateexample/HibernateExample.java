package com.tunatore.hibernateexample;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author tunatore
 */
public class HibernateExample {

	public static Customer[] getCustomersInState(String stateName) {

		// create SessionFactory object for opening Session
		SessionFactory sessionFactory = HibernateManager.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		// Criteria requires a transaction opened
		session.beginTransaction();
		// create Criteria for Customer class
		Criteria criteria = session.createCriteria(Customer.class);
		// add a Restriction which will be used for equality --> state = "MI"
		criteria.add(Restrictions.eq("state", stateName));
		// add an order for using customer_ID column
		criteria.addOrder(Order.asc("customer_ID"));
		// return the resultset as a List
		List<Customer> customers = criteria.list();

		// convert List to Array
		return customers.toArray(new Customer[customers.size()]);

	}
}