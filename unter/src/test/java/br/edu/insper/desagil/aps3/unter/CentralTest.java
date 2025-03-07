package br.edu.insper.desagil.aps3.unter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CentralTest {
    private Central c;
    private Motorista m1, m2;
    private Passageiro p1, p2;

    @BeforeEach
    void setUp() {
        c = new Central();
        p1 = new Passageiro("1", "jose");
        p2 = new Passageiro("2", "guto");
        m1 = new Motorista("3", "gui");
        m2 = new Motorista("4", "ph");
    }

    @Test
    public void nenhumaAvaliacaoPassageiro() {
        assertEquals(0.0, c.mediaPassageiro("5"));
    }

    @Test
    public void nenhumaAvaliacaoMotorista() {
        assertEquals(0.0, c.mediaMotorista("6"));
    }

    @Test
    public void avaliacoesPassageiro() {
        Corrida corrida1 = new Corrida(p1);
        Corrida corrida2 = new Corrida(p1);
        Corrida corrida3 = new Corrida(p1);
        Corrida corrida4 = new Corrida(p2);

        corrida2.avaliaPassageiro(4);
        corrida3.avaliaPassageiro(5);
        corrida4.avaliaPassageiro(3);

        c.adiciona(corrida1);
        c.adiciona(corrida2);
        c.adiciona(corrida3);
        c.adiciona(corrida4);

        assertEquals(4.5, c.mediaPassageiro("1"));
    }

    @Test
    public void avaliacoesMotorista() {
        Corrida corrida1 = new Corrida(p1);
        Corrida corrida2 = new Corrida(p1);
        Corrida corrida3 = new Corrida(p1);
        Corrida corrida4 = new Corrida(p2);
        Corrida corrida5 = new Corrida(p2);

        corrida1.setMotorista(m1);
        corrida2.setMotorista(m1);
        corrida3.setMotorista(m1);
        corrida4.setMotorista(m2);

        corrida2.avaliaMotorista(2);
        corrida3.avaliaMotorista(3);
        corrida4.avaliaMotorista(1);
        corrida5.avaliaMotorista(1);

        c.adiciona(corrida1);
        c.adiciona(corrida2);
        c.adiciona(corrida3);
        c.adiciona(corrida4);
        c.adiciona(corrida5);

        assertEquals(2.5, c.mediaMotorista("3"));
    }
}
