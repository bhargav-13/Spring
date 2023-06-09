package com.Spring.com.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
        Student s1 = (Student)a.getBean("s2");
        
        s1.setSid(1);
        s1.setFname("bhargav");
        s1.setLname("thesiya");
        s1.setEmail("bhargavthesiya693@gmail.com");
        
        System.out.println(s1);
    }
}
