package com.sid.gl.Strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String payment(){
        return paymentStrategy.payment();
    }
}
