package com.nullpointerx.introduction;

public class A8_Conditionals4 {
    public static void main(String[] args) {

        double salaryPerYear = 4000;
        double firstFaixa = 9.70/100;
        double secondFaixa = 37.35/100;
        double thirdFaixa = 49.90/100;
        double valueIncome;
        if(salaryPerYear >= 34712){
            valueIncome = salaryPerYear * firstFaixa;
        }else if(salaryPerYear >= 34713 && salaryPerYear <= 68507){
            valueIncome = salaryPerYear * secondFaixa;
        }else{
            valueIncome = salaryPerYear * thirdFaixa;
        }

        System.out.println(valueIncome);
    }
}
