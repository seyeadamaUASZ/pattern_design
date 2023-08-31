package com.sid.gl.decorator;

import java.math.BigDecimal;

public abstract class Sandwitch {
    protected String description="sandwitch";

    public String getDescription() {
        return description;
    }
    //abstract method for calcul
    public abstract BigDecimal price();
}
