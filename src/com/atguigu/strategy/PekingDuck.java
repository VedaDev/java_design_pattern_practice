package com.atguigu.strategy;

public class PekingDuck extends Duck {

    @Override
    public void display() {
        System.out.println(" peking duck ");
    }

    @Override
    public void fly() {
        System.out.println(" peking duck can not fly ");
    }

}
