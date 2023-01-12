package org.                    example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IOManager manager = new IOManager();
        Scanner sc = new Scanner(System.in);

        manager.findFigure(sc);
        manager.findSides(sc);
        switch (manager.getChooseFigure()){
            case 1:
                Square sq = new Square(manager.getX());
                sq.calcArea();
                System.out.println(manager.printArea("Square")+sq);;
                break;
            case 2:
                Triangle tg = new Triangle(manager.getX(), manager.getY());
                tg.calcArea();
                System.out.println(manager.printArea("Triangle")+tg);;
                break;
            case 3:
                Circle cc = new Circle(manager.getX());
                cc.calcArea();
                System.out.println(manager.printArea("Circle")+cc);;
                break;
            default:
                System.out.println("Fail, bye");
        }
    }
}