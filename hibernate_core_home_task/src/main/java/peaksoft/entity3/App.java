package peaksoft.entity3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import peaksoft.entity2.Car;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {

          Countryimpl countryimpl= new Countryimpl();
          Country country = new Country();

//          country.setName("Kyrgyzstan");
//          country.setLanguage("Kyrgyz");
//          country.setCapitalTown("Bishkek");
//          countryimpl.create(country);
//
//          country.setName("Russia");
//          country.setLanguage("Russian");
//          country.setCapitalTown("Moskow");
//          countryimpl.create(country);
//
//          country.setName("Tyrkey");
//          country.setLanguage("Turkish");
//          country.setCapitalTown("Ankara");
//          countryimpl.create(country);

//        System.out.println(countryimpl.read());
//        System.out.println(countryimpl.getById(3L));
//        updateTable(2L,"Japan","Japan","Tokio");
//        countryimpl.deleteById(2L);
//        countryimpl.deleteAll();


    }
    static void updateTable(Long id,String name,String language,String capital) {
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Country country = session.get(Country.class, id);
        country.setName(name);
        country.setLanguage(language);
        country.setCapitalTown(capital);
        session.getTransaction().commit();
        session.close();
    }
}
