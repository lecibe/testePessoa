package model;

public class Pessoa {

    private String nome;
    private int idade;
    private boolean acompanhado;

    public Pessoa(String nome, int idade, boolean acompanhado) {
        this.nome = nome;
        this.idade = idade;
        this.acompanhado = acompanhado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAcompanhado() {
        return acompanhado;
    }

    public void setAcompanhado(boolean acompanhado) {
        this.acompanhado = acompanhado;
    }
}
