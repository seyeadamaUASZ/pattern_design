package com.sid.gl.decorator2;

public class NuttyIceScreamDecorator extends IceScreamDecorator{
    public NuttyIceScreamDecorator(IceScream specialIceScream) {
        super(specialIceScream);
    }

    @Override
    public String makeScream() {
        return super.makeScream()+ addNutt();
    }

    private String addNutt(){
        return " add nutts";
    }
}
