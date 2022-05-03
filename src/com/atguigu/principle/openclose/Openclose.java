package com.atguigu.principle.openclose;

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
        if (s.m_types == 1) {
            drawRectangle(s);
        }else if(s.m_types == 2) {
            drawCircle(s);
        }else if(s.m_types == 3) {
            drawTriangle(s);
    }
}

    public void drawRectangle(Shape s) {
        System.out.println("draw RECTANGLE");
    }
    public void drawCircle(Shape s) {
        System.out.println("draw CIRCLE");
    }
    public void drawTriangle(Shape s) {
        System.out.println("draw TRIANGLE");
    }

}

class Shape {
    int m_types;
}

class Rectangle extends Shape {
   Rectangle() {
       super.m_types = 1;
   }
}
class Circle extends Shape {
    Circle() {
        super.m_types = 2;
    }
}
class Triangle extends Shape {
    Triangle() {
        super.m_types = 3;
    }
}
