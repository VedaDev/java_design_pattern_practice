package com.atguigu.strategy.improve;

public abstract class Duck {

    FlyBehavior flyBehavior;

    public Duck() {

    }

    public abstract void display();

    public void quack() {
        System.out.println("quack quack");
    }

    public void swim() {
        System.out.println("swim~");
    }

    public void fly() {
        if (flyBehavior != null) {
            flyBehavior.fly();
        }
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
