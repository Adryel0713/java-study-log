package com.nullpointerx.introduction;

public class A9_Conditionals5 {
    public static void main(String[] args) {

        int diaNaSemana = 5;
        switch (diaNaSemana){
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Invalido");
        }

        char sexo = 'M';

        switch (sexo){
            default:
                System.out.println("Invalido");
                break;
            case 'M': {
                System.out.println("Masculino");
                break;
            }
            case 'F': {
                System.out.println("Feminino");
                break;
            }
        }
    }
}
