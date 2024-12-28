package com.DAO;

import com.bean.categories;
import com.bean.product;
import com.bean.suppliers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class dbDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getConnection() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        return session;
    }



    public void registerProduct(product p, suppliers s, categories c)
    {
        Session session = getConnection();
        session.save(p);
        session.save(s);
        session.save(c);
        session.getTransaction().commit();
        session.close();
    }

}
