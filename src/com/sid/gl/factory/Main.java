package com.sid.gl.factory;

public class Main {
    public static void main(String[] args) {
        String zone = args[0];
        Currency currency = CurrencyFactory.createCurrency(zone);
        System.out.println(currency.getSymbol());
    }
}