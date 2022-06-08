package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory getSessionFactory(){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        return sessionFactory;
    }
    public static SessionFactory sessionFactory(){
        return getSessionFactory();
    }
    public static void shutdown(){
        getSessionFactory().close();
    }


}


