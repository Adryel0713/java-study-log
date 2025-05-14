package com.nullpointerx.introduction;

public class A10_Conditionals6 {
    public static void main(String[] args) {

        int dia = 0;

        switch (dia){

            case 1:
                System.out.println("Domingo -> Final de Semana");
            case 2:
                System.out.println("Segunda -> Dia útil");
            case 3:
                System.out.println("Terça -> Dia útil");
            case 4:
                System.out.println("Quarta -> Dia útil");
            case 5:
                System.out.println("Quinta -> Dia útil");
            case 6:
                System.out.println("Sexta -> Dia útil");
            case 7:
                System.out.println("Sabado -> Final de Semana");
                break;
            default:
                System.out.println("Invalido");
        }

    }
}
