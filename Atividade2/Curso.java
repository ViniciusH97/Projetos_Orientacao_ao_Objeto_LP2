package Atividade2;

import java.util.List;
import java.util.Objects;

// Classe Curso
class Curso {
    List<Disciplina> disciplinas;
    List<Aluno> alunos;
    public String nome;
    public String turno;
    public String periodo;

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

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int hashCode() {
        return Objects.hash(nome, turno, periodo);
    }
}