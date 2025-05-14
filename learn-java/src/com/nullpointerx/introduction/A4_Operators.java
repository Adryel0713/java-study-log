package com.nullpointerx.introduction;

public class A4_Operators {
    public static void main(String[] args) {

        // + - / *

        int number1 = 10;
        int number2 = 20;
        double math = number1 / number2;
        double math2 = (double) number1 / number2;
        double math3 =  number1 / (double) number2;
        double math4 = number1 * number2;
        double math5 = number1 - number2;
        System.out.println(number1 + number2);
        System.out.println("Value: " + number1 + number2);
        System.out.println(number1 + number2 + " values");
        System.out.println("10 / 20 = " + math);
        System.out.println("10 / 20 = " + math2);
        System.out.println("10 / 20 = " + math3);
        System.out.println("----------");
        System.out.println();

        // %
        int i = 10 % 5;
        int j = 10 % 2;
        int k = 10 % 3;
        System.out.println("10 % 5 = " + i);
        System.out.println("10 % 2 = " + j);
        System.out.println("10 % 3 = " + k);
        System.out.println("----------");
        System.out.println();
        // <> >= <= == !=

        boolean a = 10 == 5;
        boolean b = 10 >= 5;
        boolean c = 10 <= 5;
        boolean d = 10 != 5;

        System.out.println("10 == 5 = " + a);
        System.out.println("10 >= 5 = " + b);
        System.out.println("10 <= 5 = " + c);
        System.out.println("10 != 5 = " + d);
        System.out.println("----------");
        System.out.println();

        // && (AND) || (OR) !
        int idade = 30;
        double salary = 4500;

        boolean verify = idade > 18 && salary >= 3000;
        boolean verify2 = idade < 18 && salary <= 1000;

        System.out.println("idade > 18 && salary > 3000 = " + verify);
        System.out.println("idade < 18 && salary <= 1000 = " + verify2);
        System.out.println();
        double minhaConta = 700;
        double minhaCarteira = 800;
        double playStationCinco = 1500;
        boolean comprar = minhaConta + minhaCarteira >= playStationCinco || minhaConta >= playStationCinco || minhaCarteira >= playStationCinco;

        System.out.println("Comprar PlayStationCinco: " + comprar);

        System.out.println("----------");
        System.out.println();

        // = += -= *= %= /=

        double tot = 5000;
        tot /= 2; // 2500
        tot -= 500; //2000
        tot *= 10; //20000
        tot += 5000; //25000
        tot %= 150;
        System.out.println(tot);
        System.out.println("----------");
        System.out.println();

        // -- ++

        int count = 0;
        count = count + 1;
        count += 1;
        count++;
        count--;
        ++count;
        --count;
        System.out.println(count++); // 2
        System.out.println(count); // 3
        System.out.println(--count); // 2
        System.out.println(count++);// 2
        System.out.println(count); // 3
    }
}
