/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author miraj
 */
public class Main {

    
    //This is One-To-Many In Bidirectional 
    //And Using Mapping So it automatically reduce into 2 Table/
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("miraj");
        Course c1 = new Course();
        Course c2 = new Course();

//        c1.setCname("it");
//        c2.setCname("dbms");
        
        c1.setCname("c++");
        c2.setCname("java");
        
        //add for bidirectiron 
        c1.setP(p1);
        c2.setP(p1);

        p1.getCourses().add(c1);
        p1.getCourses().add(c2);
        
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        //se.save(p1) add for unidirection....
        
        //add for bidirectiron
        se.save(c1);
        se.save(c2);
        se.getTransaction().commit();
        se.close();
        sf.close();
        
    }
}
