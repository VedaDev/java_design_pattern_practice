package com.atguigu.strategy.improve;

import com.atguigu.strategy.improve.Duck;

public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" this is a wild duck ");
    }
}
