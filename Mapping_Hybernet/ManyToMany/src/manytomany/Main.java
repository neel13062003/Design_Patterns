/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author miraj
 */
public class Main {

    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setName("c");

        Course c2 = new Course();
        c2.setName("c++");

        Course c3 = new Course();
        c3.setName("java");

        Person p1 = new Person();
        p1.setName("miraj");
        p1.getCourses().add(c1);
        p1.getCourses().add(c2);

        Person p2 = new Person();
        p2.setName("raj");
        p2.getCourses().add(c1);

        Person p3 = new Person();
        p3.setName("fenil");
        p3.getCourses().add(c3);
        
        Person p4 = new Person();
        p3.setName("neel soni");
        p3.getCourses().add(c3);
        

        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(p1); //Student is owner of the relation
        session.save(p2);
        session.save(p3);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

    }

}
