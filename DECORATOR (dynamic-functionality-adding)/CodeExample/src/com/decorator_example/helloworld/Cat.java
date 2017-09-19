package com.decorator_example.helloworld;


public class Cat implements CatInterface {
    @Override
    public void doCatActions() {
        System.out.print(" meow!");
    }
}
