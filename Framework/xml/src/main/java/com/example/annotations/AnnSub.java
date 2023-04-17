package com.example.annotations;

import org.springframework.stereotype.Component;

@Component("annSub")
public class AnnSub implements AnnInterface{
    @Override
    public void showMessage() {
        System.out.println("Message from AnnSub class");
    }
}
