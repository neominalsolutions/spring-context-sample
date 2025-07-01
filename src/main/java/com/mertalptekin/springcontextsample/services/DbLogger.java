package com.mertalptekin.springcontextsample.services;

import org.springframework.stereotype.Component;

@Component("dbLogger")
public class DbLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("DbLogger");
    }
}
