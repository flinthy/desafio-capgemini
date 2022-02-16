package com.github.flinthy.desafio;

import java.util.Scanner;

public class DesafioCapgeminiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Questao1 questao1 = new Questao1();
        Questao2 questao2 = new Questao2();

        System.out.println("Questão 1:");
        System.out.println("Informe um número: ");
        int n = sc.nextInt();
        System.out.println(questao1.criaEscada(n));
        System.out.println("\n##############################");
        System.out.println("\nQuestão 2:");
        System.out.println("Digite uma senha: ");
        String senha = sc.next();
        System.out.println(questao2.validaSenha(senha));
    }
}
