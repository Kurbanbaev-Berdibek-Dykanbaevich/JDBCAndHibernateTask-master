package peaksoft.entity1;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.entity.Student;
import peaksoft.entity1.Student1;


public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student1.class)
                .buildSessionFactory();
//        Session session = null;
//        try{
//            session = sessionFactory.openSession();
//            Student student = new Student("Asel",20);
//            session.beginTransaction();
//            session.save(student);
//            session.getTransaction().commit();
//            System.out.println("add"+student);
//        }finally {
//            sessionFactory.close();
//        }
    }



}
