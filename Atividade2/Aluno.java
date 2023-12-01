package Atividade2;

class Aluno extends Pessoa {
    private String matricula;
    private String curso;
    private String turma;
    private String turno;
    private String periodo;

    public Aluno(String nome, String endereco, String telefone, String email, String dataNascimento, String matricula,
            String curso, String turma, String turno, String periodo) {
        super(nome, endereco, telefone, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.turma = turma;
        this.turno = turno;
        this.periodo = periodo;
    }

    // Getters para retornar os valores dos atributos

    public String getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public String getTurma() {
        return this.turma;
    }

    public String getTurno() {
        return this.turno;
    }

    public String getPeriodo() {
        return this.periodo;
    }

    // Setters para alterar os valores dos atributos

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}