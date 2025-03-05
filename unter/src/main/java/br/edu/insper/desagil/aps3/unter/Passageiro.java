package br.edu.insper.desagil.aps3.unter;

public class Passageiro extends Usuario {
    public Passageiro(String CPF, String nome) {
        super(CPF, nome);
    }

    public void avaliarCorrida(Corrida corrida, int nota) {
        corrida.avaliaMotorista(nota);
    }
}
