package com.deletrear.palabras;

import java.util.Scanner;

public class Deletrear2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra o conjunto de palabras: ");
        String palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length(); i++){
            System.out.println("Palabra # "+ i +" : " + palabra.substring(i , i+1));
        }
    }
}
