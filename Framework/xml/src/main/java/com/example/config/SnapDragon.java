package com.example.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements Processor {
    public void process() {
        System.out.println("snap dragon");
    }
}
