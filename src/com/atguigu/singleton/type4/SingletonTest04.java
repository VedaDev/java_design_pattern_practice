package com.atguigu.singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        com.atguigu.singleton.type4.Singleton instance = com.atguigu.singleton.type4.Singleton.getInstance();
        com.atguigu.singleton.type4.Singleton instance2 = com.atguigu.singleton.type4.Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
        System.out.println(instance == instance2);
    }
}

class Singleton {

    private static com.atguigu.singleton.type4.Singleton instance;

    private Singleton() {

    }

    public static synchronized com.atguigu.singleton.type4.Singleton getInstance() {
        if (instance == null) {
            instance = new com.atguigu.singleton.type4.Singleton();
        }
        return instance;
    }
}
