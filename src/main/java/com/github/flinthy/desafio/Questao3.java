package com.github.flinthy.desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questao3 {
    private final List<String> palavras = new ArrayList<>();

    public int contaAnagramas(String palavra) {
        List<String> palavrasCriadas = criarPalavras(palavra);
        return validaAnagrama(palavrasCriadas);
    }

    private List<String> criarPalavras(String palavra) {
        for (int i = 1; i <= palavra.length(); i++) {
            String substring = palavra.substring(0, i);
            palavras.add(substring);
        }
        if(palavra.length() > 1)
            criarPalavras(palavra.substring(1));
        return palavras;
    }

    private int validaAnagrama(List<String> palavras){
        List<String> anagramas = new ArrayList<>();
        List<String> palavrasOrdenadas = new ArrayList<>();

        for (String palavra: palavras) {
         palavrasOrdenadas.add(this.ordenaChars(palavra));
        }

        for (String palavra : palavras) {
            String charsOrdenados = ordenaChars(palavra);
            if(Collections.frequency(palavrasOrdenadas, charsOrdenados) > 1){
                anagramas.add(palavra);
                palavrasOrdenadas.remove(charsOrdenados);
            }
        }
        return (int) anagramas.stream().distinct().count();
    }

    private String ordenaChars(String palavra){
        char[] chars = palavra.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
