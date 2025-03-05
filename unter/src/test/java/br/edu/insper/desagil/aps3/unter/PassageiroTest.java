package br.edu.insper.desagil.aps3.unter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassageiroTest {
    private Passageiro p;

    @BeforeEach
    void setUp() {
        p = new Passageiro("123", "jose");
    }

    @Test
    public void constroi() {
        assertEquals("123", p.getCPF());
        assertEquals("jose", p.getNome());
    }

    @Test
    public void mudaNome() {
        p.setNome("luis");
        assertEquals("luis", p.getNome());
    }

    @Test
    public void avalia() {
        Corrida corrida = new Corrida(p);
        p.avaliarCorrida(corrida, 3);
        assertEquals(3, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaBaixo() {
        Corrida corrida = new Corrida(p);
        p.avaliarCorrida(corrida, 0);
        assertEquals(1, corrida.getNotaMotorista());
    }

    @Test
    public void avaliaAlto() {
        Corrida corrida = new Corrida(p);
        p.avaliarCorrida(corrida, 6);
        assertEquals(5, corrida.getNotaMotorista());
    }
}
