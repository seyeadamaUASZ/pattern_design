package com.sid.gl.decorator;

import java.math.BigDecimal;

public class CheeseDecorator  extends SandWitchDecorator{
    Sandwitch currentSandwitch;

    public CheeseDecorator(Sandwitch currentSandwitch) {
        this.currentSandwitch = currentSandwitch;
    }

    @Override
    public String getDescription() {
        return currentSandwitch.getDescription()+" and  cheese";
    }

    @Override
    public BigDecimal price() {
        return currentSandwitch.price().add(new BigDecimal("0.5"));
    }

}
