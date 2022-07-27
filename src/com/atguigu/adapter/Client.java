package com.atguigu.adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("=== Adapter ===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
