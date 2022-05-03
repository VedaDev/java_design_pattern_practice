package com.atguigu.principle.openclose.improve;

public class Openclose {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor {

    public void drawShape(Shape s) {
        s.draw();
    }

}

//interface Shape {
//
//    void draw();
//}

abstract class Shape {
    int m_type;

    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class Circle extends Shape {
    Circle() {
        m_type = 2;
    }
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}

class Triangle extends Shape {
    Triangle() {
        m_type = 3;
    }
    @Override
    public void draw() {
        System.out.println("draw triangle");
    }
}
