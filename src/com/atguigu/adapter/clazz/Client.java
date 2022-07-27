package com.atguigu.adapter.clazz;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== Adapter ===");
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        phone.charging(new VoltageAdapter(voltage220V));
    }
}
