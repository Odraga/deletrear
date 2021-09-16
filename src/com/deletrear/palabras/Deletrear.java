

package com.deletrear.palabras;

import java.util.Scanner;

public class Deletrear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba una palabra o conjunto de palabras: ");
        String palabra = sc.nextLine();

        char[] letra = palabra.toCharArray();

        for (int i = 0; i < palabra.length(); i++){
            System.out.println("Letra # " + i + " : "+ letra[i]);
        }
    }
}