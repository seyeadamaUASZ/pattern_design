package com.sid.gl.factory;
public class CurrencyFactory {
    public static Currency createCurrency(String zone){
        if(zone.equalsIgnoreCase("america")){
            return new CountryDollar();
        }
        if(zone.equalsIgnoreCase("europe")){
            return new CountryPesos();
        }

        if(zone.equalsIgnoreCase("afrique")){
            return new CountryCFA();
        }
       throw new IllegalArgumentException("no such zone on device");
    }
}
