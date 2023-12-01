package Atividade2;

import java.util.ArrayList;
import java.util.Scanner;


public class main {

    // Adicionei ArrayLists para armazenar os objetos
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Professor> professores = new ArrayList<>();
    static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    static ArrayList<Curso> cursos = new ArrayList<>();

    public static void Main(String args[]) {
        Scanner scan = new Scanner(System.in);

        
        int op;

        do {
            mostrarmenu();
            op = scan.nextInt();

            switch (op) {
                case 1:
                    GerenciarAlunos();
                    break;

                case 2:
                    GerenciarProfessores();
                    break;

                case 3:
                    GerenciarDisciplinas();
                    break;

                case 4:
                    GerenciarCursos();
                    break;

                case 5:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida tente novamente");
                    break;
            }

        } while (op != 5);

        scan.close();
    }

    public static void GerenciarAlunos() {
        limpartela();

        System.out.println("Menu de gerenciar alunos");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Editar Aluno");
        System.out.println("3 - Excluir Aluno");
        System.out.println("4 - Listar alunos de um curso");
        System.out.println("5 - Voltar para o menu principal");
    
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
    
        switch (op) {
            case 1:
                limpartela();

                System.out.println("Digite a matricula do aluno");
                String matricula = scan.next();
                System.out.println("Digite o curso do aluno");
                String curso = scan.next();
                System.out.println("Digite a turma do aluno");
                String turma = scan.next();
                System.out.println("Digite o turno do aluno");
                String turno = scan.next();
                System.out.println("Digite o periodo do aluno");
                String periodo = scan.next();
                Aluno aluno = new Aluno("", "", "", "", "", matricula, curso, turma, turno, periodo);
                alunos.add(aluno); 
                break;

            case 2:
                limpartela();
                System.out.println("Digite a matricula do aluno");
                String matriculaEditar = scan.next();
                System.out.println("Digite o curso do aluno");
                String cursoEditar = scan.next();
                System.out.println("Digite a turma do aluno");
                String turmaEditar = scan.next();
                System.out.println("Digite o turno do aluno");
                String turnoEditar = scan.next();
                System.out.println("Digite o periodo do aluno");
                String periodoEditar = scan.next();
    
                boolean alunoExistente = false;
                for (Aluno a : alunos) {
                    if (a.getMatricula().equals(matriculaEditar) && a.getCurso().equals(cursoEditar) && a.getTurma().equals(turmaEditar) && a.getTurno().equals(turnoEditar) && a.getPeriodo().equals(periodoEditar)) {
                        alunoExistente = true;
                        System.out.println("Digite o novo nome do aluno");
                        String novoNome = scan.next();
                        System.out.println("Digite o novo endereço do aluno");
                        String novoEndereco = scan.next();
                        System.out.println("Digite o novo telefone do aluno");
                        String novoTelefone = scan.next();
                        System.out.println("Digite a nova data de nascimento do aluno");
                        String novaDataNascimento = scan.next();
                        System.out.println("Digite a nova matricula do aluno");
                        String novaMatricula = scan.next();
                        System.out.println("Digite o novo curso do aluno");
                        String novoCurso = scan.next();
                        System.out.println("Digite a nova turma do aluno");
                        String novaTurma = scan.next();
                        System.out.println("Digite o novo turno do aluno");
                        String novoTurno = scan.next();
                        System.out.println("Digite o novo periodo do aluno");
                        String novoPeriodo = scan.next();
                        a.setNome(novoNome);
                        a.setEndereco(novoEndereco);
                        a.setTelefone(novoTelefone);
                        a.setDataNascimento(novaDataNascimento);
                        a.setMatricula(novaMatricula);
                        a.setCurso(novoCurso);
                        a.setTurma(novaTurma);
                        a.setTurno(novoTurno);
                        a.setPeriodo(novoPeriodo);
                        break;
                    }
                }
    
                if (!alunoExistente) {
                    System.out.println("Os valores informados não existem.");
                }
    
                break;

            case 3:
                limpartela();
                System.out.println("Digite a matricula do aluno");
                String matriculaExcluir = scan.next();
                System.out.println("Digite o curso do aluno");
                String cursoExcluir = scan.next();
                System.out.println("Digite a turma do aluno");
                String turmaExcluir = scan.next();
                System.out.println("Digite o turno do aluno");
                String turnoExcluir = scan.next();
                System.out.println("Digite o periodo do aluno");
                String periodoExcluir = scan.next();
    
                // Adicionei código para remover o aluno do ArrayList
                alunos.removeIf(a -> a.getMatricula().equals(matriculaExcluir) && a.getCurso().equals(cursoExcluir) && a.getTurma().equals(turmaExcluir) && a.getTurno().equals(turnoExcluir) && a.getPeriodo().equals(periodoExcluir));
                break;

            case 4:
                limpartela();
                // Adicionei código para listar os alunos
                for (Aluno a : alunos) {
                    System.out.println("Nome: " + a.getNome() + ", Matrícula: " + a.getMatricula() + ", Curso: " + a.getCurso() + ", Turma: " + a.getTurma() + ", Turno: " + a.getTurno() + ", Período: " + a.getPeriodo());
                }
                break;

            case 5:
                op = scan.nextInt();
                break;
    
            default:
                System.out.println("Opção inválida tente novamente");
                break;

        }
    }

    public static void GerenciarProfessores() {
        System.out.println("Menu de gerenciar professores");
        System.out.println("1 - Cadastrar Professor");
        System.out.println("2 - Editar Professor");
        System.out.println("3 - Excluir Professor");
        System.out.println("4 - Listar professores de um curso");

        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o curso do professor");
                String curso = scan.next();
                System.out.println("Digite a disciplina do professor");
                String disciplina = scan.next();
                System.out.println("Digite o turno do professor");
                String turno = scan.next();
                System.out.println("Digite o periodo do professor");
                String periodo = scan.next();
                Professor professor = new Professor("", "", "", "", curso, disciplina, turno, periodo);
                professores.add(professor); // Adicionei o professor ao ArrayList
                break;

            default:
                System.out.println("Opção inválida tente novamente");
                break;
        }
    }

    public static void GerenciarDisciplinas() {
        System.out.println("Menu de gerenciar disciplinas");
        System.out.println("1 - Cadastrar Disciplina");
        System.out.println("2 - Editar Disciplina");
        System.out.println("3 - Excluir Disciplina");
        System.out.println("4 - Listar disciplinas de um curso");
        Scanner scan = new Scanner(System.in);

        int op = scan.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o nome da disciplina");
                String nome = scan.next();
                System.out.println("Digite o curso da disciplina");
                String curso = scan.next();
                System.out.println("Digite o turno da disciplina");
                String turno = scan.next();
                System.out.println("Digite o periodo da disciplina");
                String periodo = scan.next();
                Disciplina disciplina = new Disciplina(nome, curso, turno, periodo);
                disciplinas.add(disciplina); // Adicionei a disciplina ao ArrayList
                break;

            default:
                break;
        }
    }

    public static void GerenciarCursos() {
        System.out.println("Menu de gerenciar cursos");
        System.out.println("1 - Cadastrar Curso");
        System.out.println("2 - Editar Curso");
        System.out.println("3 - Excluir Curso");
        System.out.println("4 - Listar cursos");
        System.out.println("5 - Voltar para o menu principal");
    
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
    
        switch (op) {
            case 1:
                System.out.println("Digite o nome do curso");
                String nomeCurso = scan.next();
                System.out.println("Digite o turno do curso");
                String turnoCurso = scan.next();
                System.out.println("Digite o periodo do curso");
                String periodoCurso = scan.next();
                Curso curso = new Curso(nomeCurso, turnoCurso, periodoCurso);
                cursos.add(curso); 
                break;
    
            case 2:
                System.out.println("Digite o nome do curso");
                String nomeCursoEditar = scan.next();
                System.out.println("Digite o turno do curso");
                String turnoCursoEditar = scan.next();
                System.out.println("Digite o periodo do curso");
                String periodoCursoEditar = scan.next();
    
                boolean cursoExistente = false;
                for (Curso c : cursos) {
                    if (c.getNome().equals(nomeCursoEditar) && c.getTurno().equals(turnoCursoEditar) && c.getPeriodo().equals(periodoCursoEditar)) {
                        cursoExistente = true;
                        System.out.println("Digite o novo nome do curso");
                        String novoNome = scan.next();
                        System.out.println("Digite o novo turno do curso");
                        String novoTurno = scan.next();
                        System.out.println("Digite o novo periodo do curso");
                        String novoPeriodo = scan.next();
                        c.setNome(novoNome);
                        c.setTurno(novoTurno);
                        c.setPeriodo(novoPeriodo);
                        break;
                    }
                }
    
                if (!cursoExistente) {
                    System.out.println("Os valores informados não existem.");
                }
    
                break;
    
            case 3:
                System.out.println("Digite o nome do curso");
                String nomeCursoExcluir = scan.next();
                System.out.println("Digite o turno do curso");
                String turnoCursoExcluir = scan.next();
                System.out.println("Digite o periodo do curso");
                String periodoCursoExcluir = scan.next();
    
                // Adicionei código para remover o curso do ArrayList
                cursos.removeIf(c -> c.getNome().equals(nomeCursoExcluir) && c.getTurno().equals(turnoCursoExcluir) && c.getPeriodo().equals(periodoCursoExcluir));
                break;
    
            case 4:
                // Adicionei código para listar os cursos
                for (Curso c : cursos) {
                    System.out.println("Nome: " + c.getNome() + ", Turno: " + c.getTurno() + ", Período: " + c.getPeriodo());
                }
                break;
    
            case 5:
                break;
    
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }

    public static void mostrarmenu(){
        System.out.println("PROGRAMA DE GERENCIAMENTO DE ESCOLA");
        System.out.println("-----------MENU----------");
        System.out.println("1 - Gerenciar Aluno");
        System.out.println("2 - Gerenciar Professor");
        System.out.println("3 - Gerenciar Disciplina");
        System.out.println("4 - Gerenciar Cursos");
        System.out.println("5 - Sair");
    }

    public static void limpartela(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}