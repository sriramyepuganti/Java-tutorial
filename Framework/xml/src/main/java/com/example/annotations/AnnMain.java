package com.example.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnMain {
    /**
         * Annotation based configuration
         * create xml file in resoruce folder
         * it first look config in xml file add below code in xml file
         * <context:component-scan base-package="com.example"/> and also
         * add @Component in Class files. to get it as bean
         */
    public void createObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationsConfig.xml");
        AnnInterface obj = (AnnInterface) context.getBean("annSuperSub");
        obj.showMessage();
    }
}
