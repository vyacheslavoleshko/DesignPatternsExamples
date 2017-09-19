package com.decorator_example.helloworld;

public class _Main {
    public static void main(String[] args) {
        CatInterface defaultCat = new Cat();
        defaultCat.doCatActions();  // meow!

        CatInterface scratchingCat = new DecoratorScratchable(new Cat());
        scratchingCat.doCatActions();  // Scratch-scratch! meow!

        CatInterface spoiledScratchingCat = new DecoratorScratchable(new DecoratorMotherFucka(new Cat()));
        spoiledScratchingCat.doCatActions();  // Scratch-scratch! motherfucka! meow!
    }
}
