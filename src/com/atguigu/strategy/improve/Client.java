package com.atguigu.strategy.improve;

public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        // dynamically change the behavior
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
        pekingDuck.setFlyBehavior(new BadFlyBehavior());
        pekingDuck.fly();
    }
}
