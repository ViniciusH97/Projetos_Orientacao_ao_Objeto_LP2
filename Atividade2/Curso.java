package Atividade2;

import java.util.Objects;

// Classe Curso
class Curso {
    private String nome;
    private String turno;
    private String periodo;

    public Curso(String nome, String turno, String periodo) {
        this.nome = nome;
        this.turno = turno;
        this.periodo = periodo;
    }

    // Getters para retornar os valores dos atributos

    public String getNome() {
        return this.nome;
    }

    public String getTurno() {
        return this.turno;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    // Setters para alterar os valores dos atributos

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Curso curso = (Curso) obj;
        return Objects.equals(nome, curso.nome) &&
            Objects.equals(turno, curso.turno) &&
            Objects.equals(periodo, curso.periodo);
    }

    public int hashCode() {
        return Objects.hash(nome, turno, periodo);
    }
}