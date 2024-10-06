package com.mycompany.atividadefor;

import java.util.Scanner;

public class AtividadeFor3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

System    .out.println("Digite um numero:");
int nmr = scanner.nextInt();

System.out.println("Tabela de 1 a" + nmr + ":");
for (int a = 1; a <= nmr; a++) {
int quadrado = a * a;
System.out.println(a + "² = " + quadrado);
}
    scanner.close();
    }
}
