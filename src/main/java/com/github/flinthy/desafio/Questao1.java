package com.github.flinthy.desafio;

public class Questao1 {
    private static String SIMBOLO = "*";
    private static String ESPACO = " ";

    public String criaEscada(int n) {
        StringBuilder saida = new StringBuilder();
        for (int i=1; i <= n; i++) {
            String simbolos = SIMBOLO.repeat(i);
            String espacos = ESPACO.repeat(n - i);
            String linhas = espacos + simbolos;
            if(i > 1) saida.append("\n");
            saida.append(linhas);
        }
        return saida.toString();
    }
}
