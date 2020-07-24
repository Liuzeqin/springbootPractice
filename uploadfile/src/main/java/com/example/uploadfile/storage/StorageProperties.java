package com.example.uploadfile.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

//需要在应用类进行enable
@ConfigurationProperties("storage")
public class StorageProperties {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
