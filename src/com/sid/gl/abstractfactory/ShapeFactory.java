package com.sid.gl.abstractfactory;

public class ShapeFactory extends AbstractFactory{
    public static final String RECTANGLE="RECTANGLE";
    public static final String SQUARE ="SQUARE";

    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase(RECTANGLE)){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase(SQUARE)){
            return new Square();
        }
        throw new IllegalArgumentException("no such shape type");
    }
}
