/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author miraj
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("miraj");
       
         Person p1 = new Person();
        p1.setName("neel");
       
       
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        //insert 
        
        
//        p = (Person) session.get(Person.class, 1);
//        if (p != null) {
//            System.out.println("Person Id = " + p.getPid() + "Name =" + p.getName());
//        }

        //update name
//        
//        p = (Person) session.get(Person.class, 1);
//        p.setName("raj");
//        session.update(p);

//        if (p != null) {
//            System.out.println("Person Id = " + p.getPid() + "Name =" + p.getName());
//        }

        //delete name
        
        p = (Person) session.get(Person.class, 2);
        session.delete(p);
//        
//        session.save(p);
//        session.save(p1);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }
}
