package com.atguigu.singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {

    }
}

class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
