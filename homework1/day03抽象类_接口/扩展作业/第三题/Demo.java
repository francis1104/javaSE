package com.itheima.day03抽象类_接口.扩展作业.第三题;

public class Demo {
    public static void main(String[] args) {
        JuXing j1 = new JuXing();
        j1.setLength(3);
        j1.setWidth(5);
        System.out.println("矩形面积是:" + j1.getArea());

        Cube c1 = new Cube();
        c1.setWidth(2);
        c1.setHight(3);
        c1.setLength(4);
        System.out.println("底面积是:" + c1.getArea());
        System.out.println("体积是:" + c1.getVolume());

    }
}

class JuXing {
    private double length;
    private double width;

    public JuXing() {
    }

    public JuXing(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }
}

class Cube extends JuXing {
    private double hight;

    public Cube() {
    }

    public Cube(double length, double width, double hight) {
        super(length, width);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    public double getVolume() {
        return getLength() * getWidth() * hight;
    }
}