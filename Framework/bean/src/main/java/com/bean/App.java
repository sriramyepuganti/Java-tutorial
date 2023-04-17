package com.bean;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(factory.getBean("name"));
        System.out.println(factory.getBean("age"));
        System.out.println(factory.getBean("printer"));
        System.out.println(factory.getBean(Device.class));
        System.out.println(factory.getBean("myAddress"));
        System.out.println(factory.getBean("printer2"));
        System.out.println(factory.getBean("printer3"));
        System.out.println(factory.getBean("printer4"));
        // Get all beans details
        Arrays.stream(factory.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
