package peaksoft.entity1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.entity.Student;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Animalimpl animalimpl = new Animalimpl();
        Animal animal = new Animal();

//        animal.setName("Tiger");
//        animal.setColor("Striped");
//        animal.setKind("Wild");
//        animalimpl.create(animal);

//        animal.setName("Dog");
//        animal.setColor("Black");
//        animal.setKind("Domestic");
//        animalimpl.create(animal);
//
//        animal.setName("Wolf");
//        animal.setColor("Grey");
//        animal.setKind("Wild");
//        animalimpl.create(animal);
//
//        animal.setName("Cow");
//        animal.setColor("White");
//        animal.setKind("Domestic");
//        animalimpl.create(animal);

//        System.out.println(animalimpl.read());
//        System.out.println(animalimpl.getById(4L));
//        animalimpl.deleteById(4L);
//        animalimpl.deleteAll();
//        updateTable(4L,"Duck","Yellow","Wild");
    }
    static void updateTable(Long id,String name,String color,String kind) {
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Animal animal = session.get(Animal.class, id);
        animal.setName(name);
        animal.setColor(color);
        animal.setKind(kind);
        session.getTransaction().commit();
        session.close();
    }
}
