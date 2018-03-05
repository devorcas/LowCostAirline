package com.velykyi.util.properties;

import java.util.ResourceBundle;

public enum  PropertyManager {
    CONFIG("config");

    private ResourceBundle resourceBundle;


    PropertyManager(String propertyName) {
        this.resourceBundle = ResourceBundle.getBundle(propertyName);
    }


    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
