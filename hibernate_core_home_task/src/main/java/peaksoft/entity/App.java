package peaksoft.entity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class App {
    public static void main(String[] args) {
        Studentimpl student = new Studentimpl();
        Student student1 = new Student();
//    student1.setSurname("Kurbanbaev");
//    student1.setName("Berdibek");
//    student1.setFacult("back-ender");
//    student1.setAge(30);
//    student.create(student1);
//
//
//
//
//    student1.setSurname("Kasymbaev");
//    student1.setName("Timurlan");
//    student1.setFacult("back-ender");
//    student1.setAge(26);
//    student.create(student1);
//
//
//    student1.setSurname("Borubaeva");
//    student1.setName("Jumagul");
//    student1.setFacult("back-ender");
//    student1.setAge(22);
//    student.create(student1);

//        System.out.println(student.getById(1L));
//        System.out.println(student.read());
//        student.deleteById(1l);
//       updateTable(5L, "John", "Martin", "Architecture", 23);
//        student.deleteAll();



    }
    static void updateTable(Long id,String name,String surname,String facult, int age){
        SessionFactory sessionFactory = HibernateUtil.sessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        student.setName(name);
        student.setSurname(surname);
        student.setFacult(facult);
        student.setAge(age);
        session.getTransaction().commit();
        session.close();

}




}
