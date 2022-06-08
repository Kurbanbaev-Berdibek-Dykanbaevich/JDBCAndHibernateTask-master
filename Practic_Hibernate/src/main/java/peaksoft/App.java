package peaksoft;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
//        User user1 = new User();
//        user1.setName("Den");
//        user1.setAge(34);
//        create(user1);
//        System.out.println(getById(1L));
//        System.out.println(getAllUsers());
       updateUser( 2L,"Juma",45);
//       deleteById(1L);

Util.close();
    }
    public static void create(User user){
        SessionFactory sessionFactory = Util.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
    }
    public static  User getById(Long id){
        SessionFactory sessionFactory = Util.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = new User();
        session.getTransaction().commit();
        session.close();
        return user;
    }
    public static List<User> getAllUsers(){
        List<User>users = null;
        SessionFactory sessionFactory = Util.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        users = session.createQuery("FROM User").getResultList();
        session.getTransaction().commit();
        session.close();
        return users;

    }
    public static void updateUser(Long id,String name,int age){
        SessionFactory sessionFactory = Util.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class,id);
        user.setName(name);
        user.setAge(age);
        session.beginTransaction().commit();
        session.close();
    }
    public static void deleteById(long id){
        SessionFactory sessionFactory= Util.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.get(User.class,id);
        session.delete(user);
        session.getTransaction().commit();
        session.close();
    }

}
