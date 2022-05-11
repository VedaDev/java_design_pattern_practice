package com.atguigu.strategy;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public abstract class Duck {

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
        System.out.println("fly~");
    }
}
