package com.foodorderingapp.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    private static final SessionFactory sessionFactory;
    static{
        try{
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        catch(Throwable e){
            System.err.println("Initial SessionFactory creation failed" + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionfactory() {
        return sessionFactory;
    }
}
