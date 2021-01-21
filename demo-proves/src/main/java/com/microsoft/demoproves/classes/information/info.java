package com.microsoft.demoproves.classes.information;

import org.springframework.stereotype.Component;

@Component
public class info {
    public static String name() {
        String n = "Cristian";
        return ("My name is: " + n);
    }
}
