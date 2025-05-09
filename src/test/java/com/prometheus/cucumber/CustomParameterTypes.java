package com.prometheus.cucumber;

import io.cucumber.java.ParameterType;

public class CustomParameterTypes {

    @ParameterType("true|false") // REGEX for analyzing input
    public boolean bool(String bool) {
        return Boolean.parseBoolean(bool);
    }
}
