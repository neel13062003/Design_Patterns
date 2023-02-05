package hibernate.user;
import hibernate.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration; 

public class Main {
    public static void main(String[] args) {
    Student st=new Student(9,"fnf");
    SessionFactory sessionFactory= new 
    Configuration().configure().buildSessionFactory(); 
    //Create a session 
    Session session=sessionFactory.openSession();
    //Create a transaction to start interaction
    session.beginTransaction();
    session.save(st);
    session.getTransaction().commit();
    session.close();
    sessionFactory.close();
    }
 }