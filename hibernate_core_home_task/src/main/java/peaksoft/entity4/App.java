package peaksoft.entity4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Cityimpl cityimpl = new Cityimpl();
        City city = new City();

//        city.setName("Bishkek");
//        city.setMayor("Aibek Dzhunushaliev");
//        city.setPopulation(1074075);
//        cityimpl.create(city);
//
//        city.setName("Moscow");
//        city.setMayor("Sergey Sobyanin");
//        city.setPopulation(12593000);
//        cityimpl.create(city);
//
//        city.setName("Tokio");
//        city.setMayor("Yuriko Koike");
//        city.setPopulation(13000000);
//        cityimpl.create(city);

//        updateTable(4l,"Osh","Almaz Mambetov",256763 );
//        System.out.println(cityimpl.read());
//        System.out.println(cityimpl.getById(3l));
//           cityimpl.deleteById(2l);
//           cityimpl.deleteAll();
    }
    static void updateTable(Long id,String name,String mayor,int population) {
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        City city = session.get(City.class, id);
        city.setName(name);
        city.setMayor(mayor);
        city.setPopulation(population);

        session.getTransaction().commit();
        session.close();
    }
}
