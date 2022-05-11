package com.atguigu.strategy;

public class ToyDuck extends Duck {


    @Override
    public void display() {
        System.out.println(" this is toy duck");
    }

    @Override
    public void quack() {
        System.out.println(" can not quack");
    }

    @Override
    public void swim() {
        System.out.println(" can not swim");
    }

    @Override
    public void fly() {
        System.out.println(" can not fly");
    }
}
