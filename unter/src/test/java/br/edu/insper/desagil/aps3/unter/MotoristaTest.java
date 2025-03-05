package br.edu.insper.desagil.aps3.unter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MotoristaTest {
    private Motorista m;
    private Passageiro p;

    @BeforeEach
    void setUp() {
        m = new Motorista("123", "jose");
    }

    @Test
    public void constroi() {
        assertEquals("123", m.getCPF());
        assertEquals("jose", m.getNome());
    }

    @Test
    public void mudaNome() {
        m.setNome("luis");
        assertEquals("luis", m.getNome());
    }

    @Test
    public void avalia() {
        Corrida corrida = new Corrida(p);
        m.avaliarCorrida(corrida, 3);
        assertEquals(3, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaBaixo() {
        Corrida corrida = new Corrida(p);
        m.avaliarCorrida(corrida, 0);
        assertEquals(1, corrida.getNotaPassageiro());
    }

    @Test
    public void avaliaAlto() {
        Corrida corrida = new Corrida(p);
        m.avaliarCorrida(corrida, 6);
        assertEquals(5, corrida.getNotaPassageiro());
    }
}
