package com.nullpointerx.introduction;

public class A6_Conditionals2 {
    public static void main(String[] args) {
        // idade < 15 -> Categoria Infantil
        // idade >= 15 -> Categoria Juvenil
        // idade >= 18 -> Categoria Adulto

        int idade = 20;
        String categoria;
        if(idade < 15){
            categoria = "Categoria Infantil";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }

        String cat = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";

        System.out.println(cat);
    }
}
