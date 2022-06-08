package peaksoft.entity5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.entity4.City;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Scienceimpl scienceimpl = new Scienceimpl();
        Science science = new Science();

//        science.setName("Philosophy");
//        science.setDirection("Philosophical");
//        science.setScientist("Al-Ghazali");
//        scienceimpl.create(science);
//
//        science.setName("Math");
//        science.setDirection("Math");
//        science.setScientist("Barry Simon");
//        scienceimpl.create(science);
//
//        science.setName("Physic");
//        science.setDirection("Physical");
//        science.setScientist("Isaac Newton");
//        scienceimpl.create(science);
        updateTable(3l,"Physic","Physical","Albert Einstein");

    }
    static void updateTable(Long id,String name,String direction,String scientist) {
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Science science = session.get(Science.class, id);
        science.setName(name);
        science.setDirection(direction);
        science.setScientist(scientist);
        session.getTransaction().commit();
        session.close();
    }
}
