package org.example;

public class Figure {
    private double area;
    private double x;
    private double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void calcArea(){
        this.area=x*y;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "{ area = " + this.area + " kv.cm }";
    }
}
