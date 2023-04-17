package com.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("annSuperSub")
public class AnnSuperSub implements AnnInterface {
    public String prop;

    /**
     * use AutoWired with setters and getters
     */
    @Autowired
    private AnnSub brand;

    public void setBrand(AnnSub brand) {
        this.brand = brand;
    }

    /**
     * we can update prop value from xml config but
     * we Need below method to update above prop property
     */
    public void setProp (String val) {
        this.prop = val;
    }


    public AnnSuperSub(String arg) {
        System.out.println(arg);
    }

    @Override
    public void showMessage() {
        System.out.println("Message from AnnSuperSub class:" + prop);
        System.out.println("Message from AnnSuperSub class:" + brand);

    }
}
