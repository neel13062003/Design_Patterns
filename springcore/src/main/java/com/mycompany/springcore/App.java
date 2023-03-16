package com.mycompany.springcore;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        System.out.println("hello word");
        ApplicationContext context =new ClassPathXmlApplicationContext("com/mycompany/springcore/sconfig.xml");
        /*Student student=(Student) context.getBean("student1");
        
        System.out.println(student);*/
    } 
}
