package com.foodorderingapp.dao;

import com.foodorderingapp.model.User;
import com.foodorderingapp.utils.HibernateUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {


    public void addUser(User user) {

        Session session= HibernateUtils.getSessionfactory().openSession();
        session.getTransaction().begin();
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }



    public User verifyUser(User user) {

        try {
            Session session = HibernateUtils.getSessionfactory().openSession();
            session.getTransaction().begin();
            String hql = "from User where userName=:userName and userPassword=:userPassword";
            Query qry = session.createQuery(hql);
            qry.setParameter("userName", user.getUserName());
            qry.setParameter("userPassword", user.getUserPassword());
            User user1 = (User) qry.list().get(0);
            System.out.println("success");
            session.getTransaction().commit();
            session.close();
            return user1;

        } catch (Exception ex) {
            System.out.println("Not Found");
        }

        return null;
    }


}
