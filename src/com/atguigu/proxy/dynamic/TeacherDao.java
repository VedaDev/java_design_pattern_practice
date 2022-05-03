package com.atguigu.proxy.dynamic;

public class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("I am a teach start to teach");
    }
}
