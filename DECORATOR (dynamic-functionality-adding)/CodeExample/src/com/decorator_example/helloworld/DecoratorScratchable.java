package com.decorator_example.helloworld;

// Scratching cat
public class DecoratorScratchable extends CatDecorator{

    public DecoratorScratchable(CatInterface innerCat) {
        super(innerCat);
    }

    @Override
    public void doCatActions() {
        System.out.print("Scratch-scratch!");
        innerCat.doCatActions(); // invoke method for next decorator or for Cat concrete object
    }
}
