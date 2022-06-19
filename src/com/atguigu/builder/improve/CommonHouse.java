package com.atguigu.builder.improve;

import java.sql.SQLOutput;

public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println(" common house build basic");
    }

    @Override
    public void buildWalls() {
        System.out.println(" common house build walls");
    }

    @Override
    public void roofed() {
        System.out.println(" common house build roof");
    }
}
