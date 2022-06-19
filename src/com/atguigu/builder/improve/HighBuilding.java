package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" build high basics");
    }

    @Override
    public void buildWalls() {
        System.out.println(" build walls for high buidling");
    }

    @Override
    public void roofed() {
        System.out.println(" build high roofs");
    }
}
