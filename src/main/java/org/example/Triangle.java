package org.example;

public class Triangle extends Figure{
    public Triangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void calcArea() {
        super.calcArea();
        super.setArea(super.getArea()/2);
    }
}
