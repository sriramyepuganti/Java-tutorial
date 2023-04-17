package com.example.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    /*
         ** XML based configuartion
         * create xml file in resources folder 
         * From spring framework import below packages any one
         * BeanFactory
         * ApplicationContext
         * * ApplicationContext is super set of BeanFactory
         */
    public void createObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig.xml");
        XmlInterface obj = (XmlInterface) context.getBean("supersub");
        obj.showMessage();
    }
}
