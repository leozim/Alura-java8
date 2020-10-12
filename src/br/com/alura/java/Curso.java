package br.com.alura.java;

public class Curso {

    private String nome;
    private int aluno;

    public Curso(String nome, int aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAluno() {
        return aluno;
    }

    public Curso getAlunos(){
        return this;
    }

    public void setAluno(int aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", aluno=" + aluno +
                '}';
    }
}
