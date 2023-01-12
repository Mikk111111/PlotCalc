package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Figure{
    public Circle(double x) {
        super(x, x);
    }

    @Override
    public void calcArea() {
        super.calcArea();
        BigDecimal temp = BigDecimal.valueOf(super.getArea()*Math.PI).setScale(2, RoundingMode.UP);
        super.setArea(temp.doubleValue());
    }
}
