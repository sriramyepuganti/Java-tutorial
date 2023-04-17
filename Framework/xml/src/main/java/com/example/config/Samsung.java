package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    // To link with Process bean
    @Autowired
    @Qualifier("snapDragon") // use this when interface was implemented by two or more classes, you can also use @primary in class(implemented)
    Processor cpu;

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void showMessage() {
        System.out.println("samsung s7");
        cpu.process();
    }
}
