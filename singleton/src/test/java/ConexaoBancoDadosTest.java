package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConexaoBancoDadosTest {

    @Test
    public void deveRetornarUrlDoBanco() {
        ConexaoBancoDados.getInstance().setUrl("jdbc:mysql://localhost:3306/meubanco");
        assertEquals("jdbc:mysql://localhost:3306/meubanco", ConexaoBancoDados.getInstance().getUrl());
    }

    @Test
    public void deveRetornarUsuario() {
        ConexaoBancoDados.getInstance().setUsuario("admin");
        assertEquals("admin", ConexaoBancoDados.getInstance().getUsuario());
    }

    @Test
    public void deveRetornarSenha() {
        ConexaoBancoDados.getInstance().setSenha("1234");
        assertEquals("1234", ConexaoBancoDados.getInstance().getSenha());
    }

    @Test
    public void deveRetornarMesmaInstancia() {
        ConexaoBancoDados conexao1 = ConexaoBancoDados.getInstance();
        ConexaoBancoDados conexao2 = ConexaoBancoDados.getInstance();
        assertSame(conexao1, conexao2);
    }
}
