package peaksoft.entity2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.entity1.Animal;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Carimpl carimpl = new Carimpl();
        Car car = new Car();

//        car.setMark("Mercedes-Benz");
//        car.setColor("Black");
//        car.setProducingСountry("Germany");
//        carimpl.create(car);
//
//        car.setMark("Toyota");
//        car.setColor("White");
//        car.setProducingСountry("Japan");
//        carimpl.create(car);
//
//        car.setMark("Ford");
//        car.setColor("Red");
//        car.setProducingСountry("USA");
//        carimpl.create(car);

//        System.out.println(carimpl.read());
//        System.out.println(carimpl.getById(2L));
//        carimpl.deleteById(1L);
//        updateTable(3L,"BMW","Black","Germany");
//        carimpl.deleteAll();
    }
    static void updateTable(Long id,String mark,String color,String productingCountry) {
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Car car = session.get(Car.class, id);
        car.setMark(mark);
        car.setColor(color);
        car.setProducingСountry(productingCountry);
        session.getTransaction().commit();
        session.close();
    }
}
