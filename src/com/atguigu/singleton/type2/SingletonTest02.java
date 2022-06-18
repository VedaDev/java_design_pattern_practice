package com.atguigu.singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        com.atguigu.singleton.type2.Singleton instance = com.atguigu.singleton.type2.Singleton.getInstance();
        com.atguigu.singleton.type2.Singleton instance2 = com.atguigu.singleton.type2.Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
        System.out.println(instance == instance2);
    }
}

class Singleton {

    private Singleton() {
    }

    private static com.atguigu.singleton.type2.Singleton instance;

    static {
        instance = getInstance();
    }

    public static com.atguigu.singleton.type2.Singleton getInstance() {
        return instance;
    }
}
