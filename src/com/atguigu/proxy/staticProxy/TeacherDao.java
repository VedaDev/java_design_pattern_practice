package com.atguigu.proxy.staticProxy;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("I am a teach start to teach");
    }
}
