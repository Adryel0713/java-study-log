package com.nullpointerx.introduction;

public class A4_Operators {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        double math = number1 / number2;
        double math2 = (double) number1 / number2;
        double math3 =  number1 / (double) number2;
        System.out.println(number1 + number2);
        System.out.println("Value: " + number1 + number2);
        System.out.println(number1 + number2 + " values");
        System.out.println("10 / 20 = " + math);
        System.out.println("10 / 20 = " + math2);
        System.out.println("10 / 20 = " + math3);
    }
}
