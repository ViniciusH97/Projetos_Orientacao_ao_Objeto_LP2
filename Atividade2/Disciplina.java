package Atividade2;

class Disciplina {
    private String nome;
    private Curso curso;
    private String turno;
    private String periodo;

    public Disciplina(String nome, Curso curso, String turno, String periodo) {
        this.nome = nome;
        this.curso = curso;
        this.turno = turno;
        this.periodo = periodo;
    }

    //  Getters para retornar os valores dos atributos

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
    }

    public String getNome() {
        return this.nome;
    }

    public Curso getCurso() {
        return this.curso;
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

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    

}