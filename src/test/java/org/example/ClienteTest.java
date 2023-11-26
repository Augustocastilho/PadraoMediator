package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    void deveRetornarSite() {
        Cliente cliente = new Cliente();
        assertEquals("Obrigado pela preferência.\n" +
            "Resposta da empresa: " +
            "Para o site com os seguintes detalhes: Site institucional\n" +
            "Serão necessárias 2 semanas.", cliente.pedirSite("Site institucional"));
    }

    @Test
    void deveRetornarAplicativo() {
        Cliente cliente = new Cliente();
        assertEquals("Obrigado pela preferência.\n" +
            "Resposta da empresa: " +
            "Para o aplicativo com os seguintes detalhes: Aplicativo de vendas\n" +
            "Serão necessárias 4 semanas.", cliente.pedirAplicativo("Aplicativo de vendas"));
    }

    @Test
    void deveRetornarSistema() {
        Cliente cliente = new Cliente();
        assertEquals("Obrigado pela preferência.\n" +
            "Resposta da empresa: " +
            "Para o sistema com os seguintes detalhes: Sistema de vendas\n" +
            "Serão necessárias 8 semanas.", cliente.pedirSistema("Sistema de vendas"));
    }

}