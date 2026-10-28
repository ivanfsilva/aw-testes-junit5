package com.ivanferreira.junit.utilidade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SaudacaoUtilTest {

    @Test
    void saudar() {
        String saudacao = SaudacaoUtil.saudar(9);
        assertEquals("Bom dia", saudacao, "Saudação incorreta!");
    }

    @Test
    void deveLancarException() {
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(-10));
        assertEquals("Hora inválida", illegalArgumentException.getMessage());
    }

    @Test
    void naoDeveLancarException() {
        assertDoesNotThrow(()-> SaudacaoUtil.saudar(0));
    }
}