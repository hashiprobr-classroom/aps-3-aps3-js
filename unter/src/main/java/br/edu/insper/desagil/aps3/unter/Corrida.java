package br.edu.insper.desagil.aps3.unter;

public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private int notaPassageiro;
    private int notaMotorista;

    public Corrida(Passageiro passageiro) {
        this.passageiro = passageiro;
        this.motorista = null;
        this.notaPassageiro = 0;
        this.notaMotorista = 0;
    }

    private int nota(int nota) {
        if (nota > 5) {
            return 5;
        }
        else {
            return nota;
        }
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public int getNotaPassageiro() {
        return notaPassageiro;
    }

    public int getNotaMotorista() {
        return notaMotorista;
    }

    public void avaliaPassageiro(int nota) {
        this.notaPassageiro = nota(nota);
    }

    public void avaliaMotorista(int nota) {
        this.notaMotorista = nota(nota);
    }
}
