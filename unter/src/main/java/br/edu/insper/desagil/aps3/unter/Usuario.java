package br.edu.insper.desagil.aps3.unter;

public class Usuario {
    private String CPF;
    String nome;

    public Usuario(String CPF, String nome) {
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void avalia(Corrida corrida) {

    }

    public void corrida(Corrida corrida) {

    }
}
