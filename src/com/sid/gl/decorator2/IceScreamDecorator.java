package com.sid.gl.decorator2;

public class IceScreamDecorator implements IceScream{
    IceScream specialIceScream; //composition

    public IceScreamDecorator(IceScream specialIceScream) {
        this.specialIceScream = specialIceScream;
    }

    @Override
    public String makeScream() {
        return specialIceScream.makeScream();
    }
}
