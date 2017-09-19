package com.decorator_example.helloworld;

public abstract class CatDecorator implements CatInterface {
    // Each decorator has "inner" cat that can be set in constructor. We are going to call
    // methods of inner cat in current cat
    protected CatInterface innerCat;

    protected CatDecorator (CatInterface c){
        innerCat = c;
    }


    @Override
    public void doCatActions() {
        innerCat.doCatActions();
    }
}
