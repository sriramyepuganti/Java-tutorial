package com.example;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.annotations.AnnMain;
import com.example.config.BeanConfig;
import com.example.xml.XmlMain;

public class App 
{
    public static void main( String[] args )
    {   
        XmlMain obj =  new XmlMain();
        obj.createObject();

        AnnMain obj1 = new AnnMain();
        obj1.createObject();
        
        BeanConfig obj2 = new BeanConfig();
    }
}
