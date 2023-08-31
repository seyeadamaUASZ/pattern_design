package com.sid.gl.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = ProducerFactory.getFactory(false);
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
