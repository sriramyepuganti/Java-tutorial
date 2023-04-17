package com.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Device(String name, int price) {};
record Address(String city) {};
record DeviceWithAddress(String name, Address address) {};

@Configuration
public class Config {
    @Bean
    public String name() {
        return "SRS";
    }
    @Bean
    public int age() {
        return 5;
    }

    @Bean
    @Primary
    // use primary when same bean is called in multiple ways
    public Device printer() {
        return new Device("printer", 1000);
    }
    // @Bean(name = "myAddress")
    @Bean("myAddress")
    public Address address() {
        return new Address("Hyderabad");
    }

    @Bean
    public Device printer2() {
        return new Device(name(), 100); // use existing bean
    }

    @Bean
    public DeviceWithAddress printer3() {
        // with methods
        return new DeviceWithAddress(name(), address());
    }

    @Bean
    public DeviceWithAddress printer4(String name, Address address) {
        // with parameters
        return new DeviceWithAddress(name, address);
    }
}
