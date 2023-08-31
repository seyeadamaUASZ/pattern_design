package com.sid.gl.builder;

public class BuildingExample {
    public static void main(String[] args) {
        //create cake for building
        Cake whiteCake = new Cake.Builder().sugar(1).butter(0.5).  eggs(2).vanila(2).flour(1.5). bakingpowder(0.75).milk(0.5).build();
        //Cake is ready to eat :)
        System.out.println(whiteCake);
    }
}
