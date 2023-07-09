package com.khadri.spring.core;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Car implements Asset{

    @Override
    public void purchase() {
        System.out.println("SUV 700");
    }
}
