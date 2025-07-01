package com.mertalptekin.springcontextsample.services;

import org.springframework.stereotype.Component;

@Component("txtLogger")
public class TextLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Text Logger");
    }
}
