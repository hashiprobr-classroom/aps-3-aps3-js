package br.edu.insper.desagil.aps3.unter;

import java.util.ArrayList;
import java.util.List;

public class Central {
    private final List<Corrida> corridas;
    
    public Central() {
        this.corridas = new ArrayList<>();
    }

    public void adiciona(Corrida c) {
        corridas.add(c);
    }

    public double mediaPassageiro(String cpf) {
        double soma = 0.0;
        int contagem = 0;

        for (Corrida c : corridas) {
            if (c.getPassageiro().getCPF().equals(cpf) && c.getNotaPassageiro() > 0) {
                soma += c.getNotaPassageiro();
                contagem++;
            }
        }
        if (contagem > 0) {
            return soma / contagem;
        }
        return 0.0;
    }

    public double mediaMotorista(String cpf) {
        double soma = 0.0;
        int contagem = 0;

        for (Corrida c : corridas) {
            if (c.getMotorista() != null && c.getMotorista().getCPF().equals(cpf) && c.getNotaMotorista() > 0) { 
                soma += c.getNotaMotorista();
                contagem++;
            }
        }
        if (contagem > 0) {
            return soma / contagem;
        }
        return 0.0;
    }
}
