package com.ivanferreira.junit.utilidade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SaudacaoUtilTest {
    @Test
    void saudar_DeveRetornarBomDia_NoLimiteDasZeroHora() {
        int horaInicial = 0;
        assertEquals("Bom dia", SaudacaoUtil.saudar(horaInicial));
    }

    @Test
    void saudar_DeveRetornarBomDia_NoLimiteDasOnze() {
        int horaFinal = 11;
        assertEquals("Bom dia", SaudacaoUtil.saudar(horaFinal));
    }

    @Test
    void saudar_DeveRetornarBoaTarde_NoLimiteDasDoze() {
        int horaInicial = 12;
        assertEquals("Boa tarde", SaudacaoUtil.saudar(horaInicial));
    }

    @Test
    void saudar_DeveRetornarBoaTarde_NoLimiteDasDezessete() {
        int horaFinal = 17;
        assertEquals("Boa tarde", SaudacaoUtil.saudar(horaFinal));
    }

    @Test
    void saudar_DeveRetornarBoaNoite_NoLimiteDasDezoito() {
        int horaInicial = 18;
        assertEquals("Boa noite", SaudacaoUtil.saudar(horaInicial));
    }

    @Test
    void saudar_DeveRetornarBoaNoite_NoLimiteDasVinteETres() {
        int horaFinal = 23;
        assertEquals("Boa noite", SaudacaoUtil.saudar(horaFinal));
    }

    @Test
    void saudar_DeveLancarExcecaoEMensagem_HoraNegativa() {
        int horaInvalidaNegativa = -1;

        IllegalArgumentException exNegativa = assertThrows(
                IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(horaInvalidaNegativa)
        );
        assertEquals("Hora inválida", exNegativa.getMessage());

    }

    @Test
    void saudar_DeveLancarExcecaoEMensagem_NoLimiteExcedente() {
        int horaInvalidaExcedente = 24;

        IllegalArgumentException exExcedente = assertThrows(
                IllegalArgumentException.class,
                () -> SaudacaoUtil.saudar(horaInvalidaExcedente)
        );
        assertEquals("Hora inválida", exExcedente.getMessage());
    }
}
