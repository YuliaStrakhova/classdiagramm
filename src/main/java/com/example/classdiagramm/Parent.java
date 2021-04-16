package com.example.classdiagramm;

import org.xmlunit.util.Mapper;

public class Parent {
    private final  Child child;
    private final Mapper mapper;

    public Parent(Mapper mapper) {
        this.mapper = mapper;
        child = new Child();
    }
}
