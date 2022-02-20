package com.github.flinthy.desafio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Questao3Test {
    private Questao3 questao3;

    @BeforeEach
    void setUp() {
        questao3 = new Questao3();
    }

    @Test
    @DisplayName("Should find anagramas")
    void shouldFindAnagramas() {
        int saidaEsperada = 3;
        String palavra = "ifailuhkqq";

        int saida = questao3.contaAnagramas(palavra);

        assertEquals(saidaEsperada, saida);
    }
}