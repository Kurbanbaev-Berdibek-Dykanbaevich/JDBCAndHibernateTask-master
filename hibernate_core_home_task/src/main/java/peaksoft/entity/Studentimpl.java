package peaksoft.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.Model;

import peaksoft.service.Service;
import util.HibernateUtil;

import javax.persistence.Query;
import java.util.List;

public class Studentimpl implements Service {


    @Override
    public void create(Model model) {
            SessionFactory sessionFactory= HibernateUtil.sessionFactory();
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            session.save(model);
            session.getTransaction().commit();
            session.close();


    }

    @Override
    public Model getById(Long id) {
        SessionFactory sessionFactory=HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Model model = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return model;

    }

    @Override
    public List<Model> read() {
            List<Model>models;
            SessionFactory sessionFactory=HibernateUtil.sessionFactory();
            Session session=sessionFactory.openSession();
            session.beginTransaction();
            models=session.createQuery("FROM Student ").getResultList();
            session.getTransaction().commit();
            session.close();
            return models;

    }





    @Override
    public void deleteById(Long id) {
        SessionFactory sessionFactory=HibernateUtil.sessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        Model model=session.get(Student.class,id);
        session.delete(model);
        session.getTransaction().commit();
        session.close();


    }

    @Override
    public void deleteAll() {
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Student ");query.executeUpdate();
        session.getTransaction().commit();
        session.close();

    }
}
