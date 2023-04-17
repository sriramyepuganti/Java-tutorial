package com.example.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfig {
    /**
     * Type-1
     * Create a configuration class (Config.java)
     * it should have methods return class instances
     * use AnnotationConfigApplicationContextto create factory object
     * use factory object to getBean 
     * 
     */

     /**
     * Type-2
     * Create a configuration class (Config.java)
     * it should be empty
     * use AnnotationConfigApplicationContextto create factory object
     * use factory object to getBean 
     * use @Component in classes
     * 
     */
    public BeanConfig() {
        ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        Samsung obj = factory.getBean(Samsung.class);
        obj.showMessage();
    }
}
