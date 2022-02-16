package com.github.flinthy.desafio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Questao2Test {
    private Questao2 questao2;

    @BeforeEach
    void setUp() {
        questao2 = new Questao2();
    }

    @Test
    @DisplayName("Should validate password")
    void shouldBuildString() {
        int saidaEsperada = 3;
        String senha = "Ya3";
        int saida = questao2.validaSenha(senha);

        assertEquals(saidaEsperada, saida);
    }
}