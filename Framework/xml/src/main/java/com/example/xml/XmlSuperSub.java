package com.example.xml;

public class XmlSuperSub implements XmlInterface {
    public String prop;

    /**
     * we can update prop value from xml config but
     * we Need below method to update above prop property
     */
    public void setProp (String val) {
        this.prop = val;
    }

    public XmlSuperSub(String arg) {
        System.out.println("XmlSuperSub: " + arg);
    }

    @Override
    public void showMessage() {
        System.out.println("Message from XmlSuperSub class:" + this.prop);
    }
}
