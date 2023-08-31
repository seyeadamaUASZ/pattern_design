package com.sid.gl.decorator;

import java.math.BigDecimal;

public class WhiteBreadSandWitch extends Sandwitch{
    public WhiteBreadSandWitch(String desc) {
        description=desc;
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal("3.0");
    }
}
