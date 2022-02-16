package com.github.flinthy.desafio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Questao1Test {

    private Questao1 questao1;

    @BeforeEach
    void setUp() {
        questao1 = new Questao1();
    }

    @Test
    @DisplayName("Should build string")
    void shouldBuildString() {
        String saidaEsperada = "     *\n" +
                               "    **\n" +
                               "   ***\n" +
                               "  ****\n" +
                               " *****\n" +
                               "******";
        int degraus = 6;
        String saida = questao1.criaEscada(degraus);

        assertEquals(saidaEsperada, saida);
    }
}