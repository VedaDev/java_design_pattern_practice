package com.atguigu.principle.inversion;

public class DependencyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {

    public String getInfo() {
        return "Email Letter: hello~";
    }
}

class Person {
    public void receive(Email mail) {
        System.out.println(mail.getInfo().toString());
    }

}
