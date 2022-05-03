package com.atguigu.principle.inversion.improve;

public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

interface IReceiver {
    String getInfo();
}

class Email implements IReceiver {

    @Override
    public String getInfo() {
        return "Email Letter: hello~";
    }
}

class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo().toString());
    }

}
