package com.nullpointerx.introduction;

public class PrimitiveTypes {
    /**
     *
     * int, double, float, char, byte, short, long, boolean
     */
    public static void main(String[] args) {
        int age = (int) 100000000000L;
        long bigNumber = (long) 100.121;
        double doubleSalary = 2000d;
        float floatSalary = (float) 2500D;
        byte byteAge = 10;
        short shortAge = 10;
        boolean right = true;
        boolean wrong = false;
        char character = 'M';
        char character2 = 65;
        char character3 = '\u0041';
        String name = "Daniel";
        var name2 = "Ricardo";

        System.out.println("The age is " + age + " years");
        System.out.println(wrong);
        System.out.println("char " + character3);
        System.out.println(bigNumber);
        System.out.println("My name is " + name);
        System.out.println("My name is " + name2);
    }
}
