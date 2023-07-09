package com.khadri.spring.core;

public interface Asset {

    default void purchase(){
        System.out.println("nothing");
    }
}
