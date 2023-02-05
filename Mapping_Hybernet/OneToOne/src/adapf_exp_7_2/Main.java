/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapf_exp_7_2;

import java.text.Annotation;
import org.hibernate.Session;
import org.hibernate.internal.SessionFactoryImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 *
 * @author miraj
 */
public class Main {
    
    //One-To-one
    public static void main(String[] args) {
        
        Student s = new Student();
        Student_details sd = new Student_details();
        
        
        //We write either create/update in web.xml
        s.setName("Jay");
//        s.setId(1);
        s.setSemester(6);
        sd.setAddress("Dhanabad");
        sd.setStu(s);             //Aa viceversa bhi kari sakay koi ek object vade.
        
        //System.out.println(s);
        
        SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        se.save(s);
        se.save(sd);
        se.getTransaction().commit();
        se.close();
        sf.close();
        
    }
    
}
