package com.atguigu.singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode() == instance2.hashCode());
        System.out.println(instance == instance2);
    }
}

class Singleton {

    private static volatile Singleton instance;

    private Singleton() {

    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
