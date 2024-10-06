package com.mycompany.atividadefor;

import java.util.Scanner;

public class AtividadeFor2 {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite um numero de 1 a 10:");
    int nmr = scanner.nextInt();
    
    if (nmr < 1 || nmr > 10){
    System.out.println("Digite um numero valido:");
    } else {
    System.out.println("Tabuada de" + nmr + ":");
    }
    for (int a = 1; a <= 10; a++) {
    int resultado = nmr * a;
    System.out.println(nmr + "x" + a + "=" + resultado);
    }
    }
}
