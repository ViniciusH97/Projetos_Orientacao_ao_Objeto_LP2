package Atividade2;

// Classe abstrata Pessoa
abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;

    public Pessoa(String nome, String cpf, String telefone, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters para os atributos

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

// Subclasse Aluno que estende Pessoa
class Aluno extends Pessoa {
    private String matricula;
    private Curso curso; // Assumindo que você já tenha a classe Curso definida
    private String turma;
    private String turno;
    private String periodo;

    public Aluno(String nome, String cpf, String telefone, String dataNascimento,
                String matricula, Curso curso, String turma, String turno, String periodo) {
        super(nome, cpf, telefone, dataNascimento);
        this.matricula = matricula;
        this.curso = curso;
        this.turma = turma;
        this.turno = turno;
        this.periodo = periodo;
    }

    // Getters e Setters para os atributos específicos de Aluno

    public String getMatricula() {
        return this.matricula;
    }

    public Curso getCurso() {
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

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(Curso curso) {
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
