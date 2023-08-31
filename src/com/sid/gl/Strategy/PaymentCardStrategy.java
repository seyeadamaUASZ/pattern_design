package com.sid.gl.Strategy;

public class PaymentCardStrategy implements PaymentStrategy {
    @Override
    public String payment() {
        return "payment card";
    }
}
