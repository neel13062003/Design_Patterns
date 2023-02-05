/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vraj;

import java.text.Annotation;
import org.hibernate.Session;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Vraj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Simple
        Student s = new Student();
        s.setName("Neel");
        s.setSemester(6);
        
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        se.save(s);
        se.getTransaction().commit();
        se.close();
        sf.close();
                
    }
    
}
