package com.atguigu.adapter.clazz;

public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("Voltage is 5 , can be charged");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("Voltage is higher than 5, can't be charged");
        }
    }
}
