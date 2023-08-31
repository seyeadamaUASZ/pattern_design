package com.sid.gl.observers;

public class NewsPaper implements Observer{
    @Override
    public void update(float interest) {
        System.out.println("newspaper notify: interest rate updates "+interest);
    }
}
