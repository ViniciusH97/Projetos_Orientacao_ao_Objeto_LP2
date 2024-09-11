package Atividade2;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<Aluno> alunos = new ArrayList<>();
    static ArrayList<Professor> professores = new ArrayList<>();
    static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    static ArrayList<Curso> cursos = new ArrayList<>();

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int op = 0;

        do {
            try {
                limpartela();
                mostrarmenu();

                if (scan.hasNextInt()) {
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
                            System.out.println("Opção inválida, tente novamente");
                            break;
                    }
                } else {
                    System.out.println("Opção inválida, tente novamente");
                    scan.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro ao executar o programa. Tente novamente.");
                scan.nextLine();
                continue;
            }

        } while (op != 5);

        scan.close();
    }

    public static void GerenciarAlunos() {
        Scanner scan = new Scanner(System.in);
        int op;

        do {
            limpartela();
            System.out.println("Menu de gerenciar alunos");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Editar Aluno");
            System.out.println("3 - Excluir Aluno");
            System.out.println("4 - Listar alunos de um curso");
            System.out.println("5 - Voltar para o menu principal");

            op = scan.nextInt();

            switch (op) {
                case 1:
                    scan.nextLine(); // Limpar o buffer
                    System.out.println("Digite o nome do aluno");
                    String nome = scan.nextLine();
                    System.out.println("Digite o telefone do aluno");
                    String telefone = scan.nextLine();
                    System.out.println("Digite o cpf do aluno");
                    String cpf = scan.nextLine();
                    System.out.println("Digite a data de nascimento do aluno");
                    String dataNascimento = scan.nextLine();
                    System.out.println("Digite a matrícula do aluno");
                    String matricula = scan.nextLine();

                    // Verificar se o aluno já foi cadastrado
                    boolean alunoJaCadastrado = false;
                    Aluno alunoExistente = null;

                    for (Aluno aluno : alunos) {
                        if (aluno.getMatricula().equals(matricula)) {
                            alunoJaCadastrado = true;
                            alunoExistente = aluno;
                            break;
                        }
                    }

                    if (!alunoJaCadastrado) {
                        System.out.println("Digite o nome do curso do aluno (deixe em branco se não tiver)");
                        String cursoNome = scan.nextLine();

                        // Curso curso = null; Esta variavel não está sendo usada

                        if (!cursoNome.isEmpty()) {
                            // Procurar o curso na lista de cursos
                            Curso cursoEncontrado = null;
                            for (Curso c : cursos) {
                                if (c.getNome().equals(cursoNome)) {
                                    cursoEncontrado = c;
                                    break;
                                }
                            }

                            if (cursoEncontrado != null) {
                                // Preencher dados do aluno
                                Aluno aluno = new Aluno(nome, cpf, telefone, dataNascimento, matricula, cursoEncontrado,
                                        "", "", "");
                                alunoExistente = aluno; // Atualizar alunoExistente
                                cursoEncontrado.addAluno(aluno); // Adicionar aluno ao curso
                                alunos.add(aluno);
                                System.out.println("Aluno cadastrado com sucesso.");
                            } else {
                                System.out.println("Curso não encontrado.");
                            }
                        } else {
                            // Preencher dados do aluno sem curso
                            Aluno aluno = new Aluno(nome, cpf, telefone, dataNascimento, matricula, null, "", "", "");
                            alunos.add(aluno);
                            System.out.println("Aluno cadastrado com sucesso.");
                            System.out.println("Pressione qualquer tecla para continuar...");
                            scan.nextLine(); // Limpar o buffer
                        }
                    } else {
                        // Aluno já cadastrado, utilizar os dados existentes
                        System.out.println("Aluno já cadastrado. Utilizando dados existentes.");
                        System.out.println("Nome: " + alunoExistente.getNome());
                        System.out.println("Matrícula: " + alunoExistente.getMatricula());
                        System.out.println("Turno: " + alunoExistente.getTurno());
                        System.out.println("Período: " + alunoExistente.getPeriodo());
                    }
                    break;

                case 2:
                    limpartela();
                    System.out.println("Digite a matricula do aluno");
                    String matriculaEditar = scan.nextLine();
                    System.out.println("Digite a turma do aluno");
                    String turmaEditar = scan.nextLine();
                    System.out.println("Digite o curso do aluno");
                    String cursoEditar = scan.nextLine();
                    System.out.println("Digite o turno do aluno");
                    String turnoEditar = scan.nextLine();
                    System.out.println("Digite o periodo do aluno");
                    String periodoEditar = scan.nextLine();

                    boolean aluno_existe = false;
                    for (Aluno a : alunos) {
                        if (a.getMatricula().equals(matriculaEditar) &&
                                ((a.getCurso() != null && a.getCurso().getNome().equals(cursoEditar))
                                        || a.getCurso() == null)
                                &&
                                a.getTurma().equals(turmaEditar) &&
                                a.getTurno().equals(turnoEditar) &&
                                a.getPeriodo().equals(periodoEditar)) {

                            aluno_existe = true;
                            System.out.println("Digite o novo nome do aluno");
                            String novoNome = scan.nextLine();
                            System.out.println("Digite o novo cpf do aluno");
                            String novocpf = scan.nextLine();
                            System.out.println("Digite o novo telefone do aluno");
                            String novoTelefone = scan.nextLine();
                            System.out.println("Digite a nova data de nascimento do aluno");
                            String novaDataNascimento = scan.nextLine();
                            System.out.println("Digite a nova matricula do aluno");
                            String novaMatricula = scan.nextLine();
                            System.out.println("Digite o novo curso do aluno");
                            String novoCursoNome = scan.nextLine();
                            System.out.println("Digite a nova turma do aluno");
                            String novaTurma = scan.nextLine();
                            System.out.println("Digite o novo turno do aluno");
                            String novoTurno = scan.nextLine();
                            System.out.println("Digite o novo periodo do aluno");
                            String novoPeriodo = scan.nextLine();

                            Curso novoCurso = novoCursoNome.isEmpty() ? null : new Curso(novoCursoNome, "", "");

                            a.setNome(novoNome);
                            a.setCpf(novocpf);
                            a.setCurso(novoCurso);
                            a.setTelefone(novoTelefone);
                            a.setDataNascimento(novaDataNascimento);
                            a.setMatricula(novaMatricula);
                            a.setTurma(novaTurma);
                            a.setTurno(novoTurno);
                            a.setPeriodo(novoPeriodo);
                            break;
                        }
                    }

                    if (!aluno_existe) {
                        System.out.println("Os valores informados não existem.");
                    }

                    break;

                case 3:

                    try {
                        limpartela();
                        scan.nextLine();
                        System.out.println("Digite a matricula do aluno");
                        String matriculaExcluir = scan.nextLine();
                        System.out.println("Digite o curso do aluno");
                        String cursoExcluir = scan.nextLine();
                        System.out.println("Digite a turma do aluno");
                        String turmaExcluir = scan.nextLine();
                        System.out.println("Digite o turno do aluno");
                        String turnoExcluir = scan.nextLine();
                        System.out.println("Digite o periodo do aluno");
                        String periodoExcluir = scan.nextLine();

                        alunos.removeIf(a -> a.getMatricula().equals(matriculaExcluir)
                                && a.getCurso().getNome().equals(cursoExcluir)
                                && a.getTurma().equals(turmaExcluir)
                                && a.getTurno().equals(turnoExcluir)
                                && a.getPeriodo().equals(periodoExcluir));

                        break;
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro ao acessar a lista. Índice inválido.");
                    } catch (ConcurrentModificationException e) {
                        System.out.println("Erro ao modificar a lista durante a iteração.");
                    }

                case 4:
                    limpartela();
                    if(alunos.isEmpty()) {
                        System.out.println("Não há alunos cadastrados.");
                        System.out.println("Pressione qualquer tecla para continuar...");
                        scan.nextLine(); // Limpar o buffer
                        scan.nextLine(); // Aguardar o usuário pressionar qualquer tecla
                    }
                    for (Aluno a : alunos) {
                        System.out.print("Nome: " + a.getNome() + ", Matrícula: " + a.getMatricula());

                        if (a.getCurso() != null) {
                            System.out.print(", Curso: " + a.getCurso().getNome());
                        }

                        System.out.println(", Turma: " + a.getTurma() + ", Turno: " + a.getTurno() + ", Período: "
                                + a.getPeriodo());
                    }
                    System.out.println("Pressione qualquer tecla para continuar...");
                    scan.nextLine(); // Limpar o buffer
                    scan.nextLine(); // Aguardar o usuário pressionar qualquer tecla
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }

        } while (op != 5);

        // Voltar para o menu principal ao sair do submenu
        main(new String[0]);
        scan.close();

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
                scan.nextLine(); // Limpar o buffer
                System.out.println("Digite o nome do professor");
                String nome = scan.nextLine();
                System.out.println("Digite o cpf do professor");
                String cpf = scan.nextLine();
                System.out.println("Digite o telefone do professor");
                String telefone = scan.nextLine();
                System.out.println("Digite o curso do professor");
                String curso = scan.nextLine();
                System.out.println("Digite a data de nascimento do professor");
                String dataNascimento = scan.nextLine();
                System.out.println("Digite o salario do professor");
                String salario = scan.nextLine();
                System.out.println("Digite a disciplina do professor");
                String disciplina = scan.nextLine();
                System.out.println("Digite o turno do professor");
                String turno = scan.nextLine();
                System.out.println("Digite o periodo do professor");
                String periodo = scan.nextLine();
                Professor professor = new Professor(nome, cpf, telefone, dataNascimento, curso, disciplina, turno,
                        periodo, salario);
                professores.add(professor);
                break;

            case 2:
                scan.nextLine(); // Limpar o buffer
                System.out.println("Digite o curso do professor");
                String cursoEditar = scan.nextLine();
                System.out.println("Digite a disciplina do professor");
                String disciplinaEditar = scan.nextLine();
                System.out.println("Digite o turno do professor");
                String turnoEditar = scan.nextLine();
                System.out.println("Digite o periodo do professor");
                String periodoEditar = scan.nextLine();

                boolean professorExistente = false;
                for (Professor p : professores) {
                    if (p.getCurso().equals(cursoEditar) && p.getDisciplina().equals(disciplinaEditar)
                            && p.getTurno().equals(turnoEditar) && p.getPeriodo().equals(periodoEditar)) {
                        professorExistente = true;
                        System.out.println("Digite o novo nome do professor");
                        String novoNome = scan.nextLine();
                        System.out.println("Digite o novo cpf do professor");
                        String novocpf = scan.nextLine();
                        System.out.println("Digite o novo telefone do professor");
                        String novoTelefone = scan.nextLine();
                        System.out.println("Digite a nova data de nascimento do professor");
                        String novaDataNascimento = scan.nextLine();
                        System.out.println("Digite o novo salario do professor");
                        String novoSalario = scan.nextLine();
                        System.out.println("Digite o novo curso do professor");
                        String novoCurso = scan.nextLine();
                        System.out.println("Digite a nova disciplina do professor");
                        String novaDisciplina = scan.nextLine();
                        System.out.println("Digite o novo turno do professor");
                        String novoTurno = scan.nextLine();
                        System.out.println("Digite o novo periodo do professor");
                        String novoPeriodo = scan.nextLine();
                        p.setNome(novoNome);
                        p.setCpf(novocpf);
                        p.setTelefone(novoTelefone);
                        p.setDataNascimento(novaDataNascimento);
                        p.setCurso(novoCurso);
                        p.setDisciplina(novaDisciplina);
                        p.setTurno(novoTurno);
                        p.setPeriodo(novoPeriodo);
                        p.setSalario(novoSalario);
                        break;
                    }
                }

                if (!professorExistente) {
                    System.out.println("Os valores informados não existem.");
                }

                break;

            case 3:
                System.out.println("Digite o curso do professor");
                String cursoExcluir = scan.nextLine();
                System.out.println("Digite a disciplina do professor");
                String disciplinaExcluir = scan.nextLine();
                System.out.println("Digite o turno do professor");
                String turnoExcluir = scan.nextLine();
                System.out.println("Digite o periodo do professor");
                String periodoExcluir = scan.nextLine();

                professores
                        .removeIf(p -> p.getCurso().equals(cursoExcluir) && p.getDisciplina().equals(disciplinaExcluir)
                                && p.getTurno().equals(turnoExcluir) && p.getPeriodo().equals(periodoExcluir));
                break;

            case 4:
                if (!professores.isEmpty()) {
                    for (Professor p : professores) {
                        System.out.println("Nome: " + p.getNome() + ", Curso: " + p.getCurso() + ", Disciplina: "
                                + p.getDisciplina() + ", Turno: " + p.getTurno() + ", Período: " + p.getPeriodo());
                    }
                } else {
                    System.out.println("Não há professores cadastrados");
                }

                System.out.println("Pressione qualquer tecla para continuar...");
                scan.nextLine(); // Limpar o buffer
                scan.nextLine(); // Aguardar o usuário pressionar qualquer tecla
                break;
            default:
                System.out.println("Opção inválida tente novamente");
                break;
        }
        scan.close();
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
                scan.nextLine(); // Limpar o buffer
                System.out.println("Digite o nome da disciplina");
                String nome = scan.nextLine();
                System.out.println("Digite o curso da disciplina");
                String nomeCurso = scan.nextLine();

                Curso cursoEncontrado = null;
                for (Curso c : cursos) {
                    if (c.getNome().equals(nomeCurso)) {
                        cursoEncontrado = c;
                        break;
                    }
                }

                if (cursoEncontrado != null) {
                    System.out.println("Digite o turno da disciplina");
                    String turno = scan.nextLine();
                    System.out.println("Digite o periodo da disciplina");
                    String periodo = scan.nextLine();

                    Disciplina d = new Disciplina(nome, cursoEncontrado, turno, periodo);
                    cursoEncontrado.addDisciplina(d); // Adicionar disciplina ao curso
                    disciplinas.add(d);
                } else {
                    System.out.println("Curso não encontrado.");
                    System.out.println("Pressione qualquer tecla para continuar...");
                    scan.nextLine(); // Limpar o buffer
                }

                System.out.println("Disciplina cadastrada com sucesso.");
                System.out.println("Pressione qualquer tecla para continuar...");
                scan.nextLine(); // Limpar o buffer

                break;

            case 2:
                System.out.println("Digite o nome da disciplina");
                String nomeEditar = scan.next();
                System.out.println("Digite o curso da disciplina");
                String cursoEditar = scan.next();
                System.out.println("Digite o turno da disciplina");
                String turnoEditar = scan.next();
                System.out.println("Digite o periodo da disciplina");
                String periodoEditar = scan.next();

                boolean disciplinaExistente = false;
                for (Disciplina d : disciplinas) {
                    if (d.getNome().equals(nomeEditar) && d.getCurso().getNome().equals(cursoEditar)
                            && d.getTurno().equals(turnoEditar) && d.getPeriodo().equals(periodoEditar)) {
                        disciplinaExistente = true;
                        System.out.println("Digite o novo nome da disciplina");
                        String novoNome = scan.next();
                        System.out.println("Digite o novo curso da disciplina");
                        String novoCursoNome = scan.next();
                        System.out.println("Digite o novo turno da disciplina");
                        String novoTurno = scan.next();
                        System.out.println("Digite o novo periodo da disciplina");
                        String novoPeriodo = scan.next();

                        // Criar uma instância de Curso com base na nova String
                        Curso novoCurso = new Curso(novoCursoNome, novoTurno, novoPeriodo);

                        // Modificar os atributos da disciplina
                        d.setNome(novoNome);
                        d.setCurso(novoCurso);
                        d.setTurno(novoTurno);
                        d.setPeriodo(novoPeriodo);
                        break;
                    }
                }

                if (!disciplinaExistente) {
                    System.out.println("Os valores informados não existem.");
                }

                break;

            case 3:
                System.out.println("Digite o nome da disciplina");
                String nomeExcluir = scan.next();
                System.out.println("Digite o curso da disciplina");
                String cursoExcluir = scan.next();
                System.out.println("Digite o turno da disciplina");
                String turnoExcluir = scan.next();
                System.out.println("Digite o periodo da disciplina");
                String periodoExcluir = scan.next();

                disciplinas.removeIf(d -> d.getNome().equals(nomeExcluir)
                        && d.getCurso().getNome().equals(cursoExcluir)
                        && d.getTurno().equals(turnoExcluir)
                        && d.getPeriodo().equals(periodoExcluir));
                break;

            case 4:

                if (!disciplinas.isEmpty()) {
                    for (Disciplina d : disciplinas) {
                        System.out.println(
                                "Nome: " + d.getNome() + ", Curso: " + d.getCurso() + ", Turno: " + d.getTurno()
                                        + ", Período: " + d.getPeriodo());
                    }
                } else {
                    System.out.println("Não há disciplinas cadastradas");
                }

                System.out.println("Pressione qualquer tecla para continuar...");
                scan.nextLine(); // Limpar o buffer
                scan.nextLine(); // Aguardar o usuário pressionar qualquer tecla
                break;

            case 5:
                break;
            default:
                System.out.println("Opção inválida tente novamente");
                break;
        }
        scan.close();
    }

    public static void GerenciarCursos() {
        System.out.println("Menu de gerenciar cursos");
        System.out.println("1 - Cadastrar Curso");
        System.out.println("2 - Editar Curso");
        System.out.println("3 - Excluir Curso");
        System.out.println("4 - Listar cursos");
        System.out.println("5 - Voltar para o menu principal");

        Scanner scan = new Scanner(System.in);
        int op;

        do {
            op = scan.nextInt();

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
                        if (c.getNome().equals(nomeCursoEditar) && c.getTurno().equals(turnoCursoEditar)
                                && c.getPeriodo().equals(periodoCursoEditar)) {
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

                    cursos.removeIf(c -> c.getNome().equals(nomeCursoExcluir) && c.getTurno().equals(turnoCursoExcluir)
                            && c.getPeriodo().equals(periodoCursoExcluir));
                    break;

                case 4:
                    for (Curso c : cursos) {
                        System.out.println(
                                "Nome: " + c.getNome() + ", Turno: " + c.getTurno() + ", Período: " + c.getPeriodo());
                    }
                    System.out.println("Pressione qualquer tecla para continuar...");
                    scan.nextLine();
                    break;

                case 5:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 5);

        main(new String[0]);

        scan.close();
    }

    public static void mostrarmenu() {
        System.out.println("PROGRAMA DE GERENCIAMENTO DE ESCOLA");
        System.out.println("-----------MENU----------");
        System.out.println("1 - Gerenciar Aluno");
        System.out.println("2 - Gerenciar Professor");
        System.out.println("3 - Gerenciar Disciplina");
        System.out.println("4 - Gerenciar Cursos");
        System.out.println("5 - Sair");
    }

    public static void limpartela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
