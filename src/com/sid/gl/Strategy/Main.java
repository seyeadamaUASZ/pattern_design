package com.sid.gl.Strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new PaymentCardStrategy());
        System.out.println(context.payment());
    }
}
