package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        //if there is only one bean of type Developer in config.xml
//        Developer dev=context.getBean(Developer.class);

        //We can use bean name/id if multiple beans of same type
        Developer dev= (Developer) context.getBean("dev1");
        System.out.println(dev.getAge());
        dev.build();
    }
}
