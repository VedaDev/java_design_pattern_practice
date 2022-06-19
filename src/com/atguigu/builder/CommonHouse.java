package com.atguigu.builder;

public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println(" common house ground");
    }

    @Override
    public void buildWalls() {
        System.out.println(" common house wall");
    }

    @Override
    public void roofed() {
        System.out.println(" common house roof");
    }
}
