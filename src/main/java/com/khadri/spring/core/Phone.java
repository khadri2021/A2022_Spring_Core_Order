package com.khadri.spring.core;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class Phone implements Asset{

    @Override
    public void purchase() {
        System.out.println("IPHONE");
    }
}
