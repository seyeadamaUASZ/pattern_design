package com.sid.gl.Strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public String payment() {
        return "payment paypal";
    }
}
