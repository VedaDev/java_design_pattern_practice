package com.atguigu.principle.inversion.passing;

public class DependencyPass {

    public static void main(String[] args) {

    }
}

/* interface */
//interface IOpenAndClose {
//    public void open(ITV tv);
//}
//
//interface ITV {
//    public void play();
//}
//
// interface
//class OpenAndClose implements IOpenAndClose {
//
//    @Override
//    public void open(ITV tv) {
//        tv.play();
//    }
//}

/* constructor */
interface IOpenAndClose {
    public void open();
}

interface ITV {
    public void play();
}
// constructor
class OpenAndClose implements IOpenAndClose {

    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
