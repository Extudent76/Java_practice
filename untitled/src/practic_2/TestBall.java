package practic_2;

import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Ball x1 = new Ball();
        System.out.println("Введите X и Y");
        Scanner scanx = new Scanner(System.in);
        Scanner scany = new Scanner(System.in);
        x1.setXY(scanx.nextDouble(),scany.nextDouble());
        System.out.println("Введите новые X и Y");
        Scanner xDisp = new Scanner(System.in);
        Scanner yDisp = new Scanner(System.in);
        x1.move(xDisp.nextDouble(),yDisp.nextDouble());
        System.out.println(x1.toString());
    }
}
