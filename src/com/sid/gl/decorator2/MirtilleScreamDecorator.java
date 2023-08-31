package com.sid.gl.decorator2;

public class MirtilleScreamDecorator extends IceScreamDecorator{
    public MirtilleScreamDecorator(IceScream specialIceScream) {
        super(specialIceScream);
    }

    @Override
    public String makeScream() {
        return super.makeScream()+addMirtille();
    }
    private String addMirtille(){
        return " mirtille";
    }
}
