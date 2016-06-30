package com.tunatore.hibernateexample;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibernateManager // Hibernate utility class
{
  private static final SessionFactory sessionFactory;

  static {    //create sessionFactory only once    
    try {
      // creating the SessionFactory from hibernate.cfg.xml            
      sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    } catch (Throwable ex) {
           System.err.println("SessionFactory initial creation error."+ ex);
      throw new ExceptionInInitializerError(ex);
    }
  }
  public static SessionFactory getSessionFactory() {
     return sessionFactory;
  }

}