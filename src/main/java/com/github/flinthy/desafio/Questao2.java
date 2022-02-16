package com.github.flinthy.desafio;

public class Questao2 {
    private static int QTD_MINIMA = 6;

    public int validaSenha(String senha) {
        int qtdRestante = QTD_MINIMA - senha.length();
        return Math.max(qtdRestante, 0);
    }
}
