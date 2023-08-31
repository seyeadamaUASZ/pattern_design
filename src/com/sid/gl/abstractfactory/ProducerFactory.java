package com.sid.gl.abstractfactory;

public class ProducerFactory {
    public static AbstractFactory getFactory(boolean rounded){
        return rounded ? new RoundShapeFactory() : new ShapeFactory();
    }
}
