package com.decorator_example.helloworld;

/**
 * Spoiled cat!
 *
 * @author Viacheslav Oleshko
 */

// Spoiled cat!
public class DecoratorMotherFucka extends CatDecorator{

    public DecoratorMotherFucka(CatInterface innerCat) {
        super(innerCat);
    }



    @Override
    public void doCatActions() {
        System.out.print(" motherfucka!");
        innerCat.doCatActions(); // invoke method for next decorator or for Cat concrete object
    }
}
