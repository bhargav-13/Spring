package com.Spring.com.SpringDibyConstructor;

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
        Student s1 = (Student)a.getBean("s1");
        System.out.println(s1);
    }
}
