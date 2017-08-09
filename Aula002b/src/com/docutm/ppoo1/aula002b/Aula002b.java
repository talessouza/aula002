package com.docutm.ppoo1.aula002b;

import java.util.Scanner;

public class Aula002b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numeroDigitado = in.nextInt();
        System.out.println("O número digitado foi: " + numeroDigitado);
        for(int i = 0; i < numeroDigitado; i++) {
            System.out.print(i + ", ");
        }
    }
    
}
