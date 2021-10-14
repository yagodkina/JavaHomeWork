package com.pb.tkachenko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        int x;
        int y;
        String sign; // + - * /

        System.out.println("введи первое число: ");
        x = calc.nextInt () ;

        System.out.println("введи второе число:  ");
        y = calc.nextInt ();

        System.out.println("введи знак: ");
        sign = calc.next () ;

        System.out.println("x = " + x + "y = " + y + " sign = " + sign) ;


        switch(sign) {
            case "+":
                System.out.println("x + y = " + (x + y));
                break;
            case "-":
                System.out.println("x - y = " + (x - y));
                break;
            case "*":
                System.out.println("x * y = " + (x * y));
                break;
            case "/" :
                if (y != 0)
                {System.out.println("x / y = " + (x / y));}
                else System.out.println( "делить на ноль нельзя");
                break;
        }
    }
}
