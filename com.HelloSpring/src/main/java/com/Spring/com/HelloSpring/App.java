package com.Spring.com.HelloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
        Student s = (Student)a.getBean("s2");
        System.out.println("Sid:" + s.getSid());
        System.out.println("fname = " + s.getFname());
        System.out.println("lname= " + s.getLname());
        System.out.println("email= " + s.getEmail());
        a.registerShutdownHook();
    }
}
