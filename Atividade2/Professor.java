package Atividade2;
import java.util.ArrayList;
import java.util.List;

// Classe Professor que herda de Pessoa
class Professor extends Pessoa {
    private List<Disciplina> disciplinaMinistrada;
    private String curso;
    private String disciplina;
    private String turno;
    private String periodo;

    public Professor(String nome, String endereco, String telefone, String dataNascimento, String curso,
            String disciplina, String turno, String periodo) {
        super(nome, endereco, telefone, dataNascimento);
        this.curso = curso;
        this.disciplina = disciplina;
        this.turno = turno;
        this.periodo = periodo;
    }

    // Getters para retornar os valores dos atributos

    public String getCurso() {
        return this.curso;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public String getTurno() {
        return this.turno;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    // Setters para alterar os valores dos atributos

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void adicionardisciplina(Disciplina disciplina) {
        if (disciplinaMinistrada != null) {
            disciplinaMinistrada = new ArrayList<Disciplina>();
        }
        disciplinaMinistrada.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinaMinistrada;
    }
}