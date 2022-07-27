package com.atguigu.adapter.interfaces;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter adapter = new AbstractAdapter() {

            @Override
            public  void m1() {
                System.out.println("Using method m1");
            }

        };
        adapter.m1();
    }
}
