package com.sid.gl.decorator;

public class Main {
    public static void main(String[] args) {

        Sandwitch mySandwich = new WhiteBreadSandWitch("White bread Sandwich");
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(),
                mySandwich.price());

        //adding extra cheese using Decorator Pattter
        mySandwich = new CheeseDecorator(mySandwich);
        //add xtra cheese
        mySandwich = new XtraCheeseDecorator(mySandwich);

        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(),
                mySandwich.price());


    }
}
