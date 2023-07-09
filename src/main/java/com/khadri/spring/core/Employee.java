package com.khadri.spring.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Employee {

    @Autowired
    private List<Asset> assetList;

    public void setAssetList(List<Asset> assetList) {
        this.assetList = assetList;
    }

    public List<Asset> getAssetList() {
        return assetList;
    }
}

