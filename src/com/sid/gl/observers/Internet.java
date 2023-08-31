package com.sid.gl.observers;

public class Internet implements Observer{
    @Override
    public void update(float interest) {
        System.out.println("internet: interest rate evaluate "+interest);
    }
}
