package org.example;

import java.util.Scanner;

public class IOManager {
    private int chooseFigure;
    private double x;
    private double y;

    public int getChooseFigure() {
        return chooseFigure;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void findFigure(Scanner sc){
        try{
            System.out.println("Enter which figure to test:");
            System.out.println("1-Square");
            System.out.println("2-Triangle");
            System.out.println("3-Circle");
            this.chooseFigure = sc.nextInt();
        }catch (Exception e){
            System.out.println("SUPER fail, bye");
        }
    }

    public void findSides(Scanner sc){
        try {

            switch (chooseFigure){
                case 1:
                    System.out.println("Enter Square  x:");
                    this.x=sc.nextInt();
                    this.y=this.x;
                    break;
                case 2:
                    System.out.println("Enter Triangle  x:");
                    this.x=sc.nextInt();
                    System.out.println("Enter Triangle  y:");
                    this.y=sc.nextInt();
                    break;
                case 3:
                    System.out.println("Enter Circle  x:");
                    this.x=sc.nextInt();
                    this.y=this.x;
                    break;
                default:
                    System.out.println("Fail, bye");
            }
        }catch (Exception e){
            System.out.println("SUPER fail, bye");
        }
    }
    public String printArea(String str){
        return ("Figure "+str+" data: ");
    }

}
