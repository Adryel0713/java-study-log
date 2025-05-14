package com.nullpointerx.introduction;

public class A5_Conditionals {
    public static void main(String[] args) {
        // if

        int idade = 19;
        if (true) {
            System.out.println("Executa sempre");
        }
        if (true) System.out.println("Executa sempre");

        // !
        boolean isBeber = idade >= 18;
        if(isBeber){
            System.out.println("Pode beber!");
        }else{
            System.out.println("Não pode beber rapa");
        }
        if(!isBeber){
            System.out.println("Não pode beber!");
        }

        // certificação
        boolean verificar = false;
        if(verificar = true){
            System.out.println("Isso nunca vai ser usado no mundo real");
        }
    }
}
