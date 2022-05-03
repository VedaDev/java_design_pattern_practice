package com.atguigu.proxy.staticProxy;

public class TeacherDaoProxy implements ITeacherDao {

    private  ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("start to proxy");
        target.teach();
        System.out.println("commit");
    }
}
