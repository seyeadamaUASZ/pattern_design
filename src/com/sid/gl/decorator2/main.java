package com.sid.gl.decorator2;

public class main {
    public static void main(String[] args) {
        IceScream iceScream = new IceScreamDecorator
                (new NuttyIceScreamDecorator
                        (new MirtilleScreamDecorator(new SimpleIceScream())));
        System.out.println(iceScream.makeScream());
    }
}
