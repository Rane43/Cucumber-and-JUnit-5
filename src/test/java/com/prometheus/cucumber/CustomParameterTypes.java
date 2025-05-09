package com.prometheus.cucumber;

import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

    @ParameterType("true|false")
    public boolean bool(String bool) {
        return Boolean.parseBoolean(bool);
    }
}
