package com.khadri.spring.core;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class House implements Asset{

    @Override
    public void purchase() {
        System.out.println("Villa");
    }
}
