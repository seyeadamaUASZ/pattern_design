package com.sid.gl.abstractfactory;

public class RoundShapeFactory extends AbstractFactory{
    public static final String ROUND_RECTANGLE="RECTANGLE";
    public static final String ROUND_SQUARE="SQUARE";
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase(ROUND_RECTANGLE)){
            return new RoundRectangle();
        }
        if(shapeType.equalsIgnoreCase(ROUND_SQUARE)){
            return new RoundSquare();
        }
        throw new IllegalArgumentException("no such shape type for round");
    }
}
