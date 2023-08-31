package com.sid.gl.decorator;

import java.math.BigDecimal;

public class XtraCheeseDecorator extends SandWitchDecorator{
    Sandwitch sandwitch; //composition

    public XtraCheeseDecorator(Sandwitch sandwitch) {
        this.sandwitch = sandwitch;
    }

    @Override
    public BigDecimal price() {
        return sandwitch.price().add(new BigDecimal("0.9"));
    }
}
