package com.atguigu.strategy.improve;

public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" peking duck ");
    }

}
