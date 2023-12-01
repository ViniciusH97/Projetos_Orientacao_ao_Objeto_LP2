package exercicio8;

import java.util.Scanner;

public class Funcionario {

    private String CPF;
    private String nome;
    private String NIS;
    private String RG;
    private String DataNascimento;
    private String email;
    private String endereço;
    private String escolaridade;
    private double salário;
    private String cargo;
    private String EntradaEmpresa;
    private String ContaBanco;

    public Funcionario(String CPF, String nome, String NIS, String RG, String DataNascimento, String email, String endereço, String escolaridade, double salário, String cargo, String EntradaEmpresa, String ContaBanco) {
        this.CPF = CPF;
        this.nome = nome;
        this.NIS = NIS;
        this.RG = RG;
        this.DataNascimento = DataNascimento;
        this.email = email;
        this.endereço = endereço;
        this.escolaridade = escolaridade;
        this.salário = salário;
        this.cargo = cargo;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Solicitando as informações do funcionário
        System.out.println("Digite o CPF do funcionário: ");
        String CPF = scan.nextLine();

        System.out.println("Digite o nome do funcionário: ");
        String nome = scan.nextLine();

        System.out.println("Digite o NIS do funcionário: ");
        String NIS = scan.nextLine();

        System.out.println("Digite o RG do funcionário: ");
        String RG = scan.nextLine();

        System.out.println("Digite a data de nascimento do funcionário: ");
        String DataNascimento = scan.nextLine();

        System.out.println("Digite o email do funcionário: ");
        String email = scan.nextLine();

        System.out.println("Digite o endereço do funcionário: ");
        String endereço = scan.nextLine();

        System.out.println("Digite a escolaridade do funcionário: ");
        String escolaridade = scan.nextLine();

        System.out.println("Digite o salário do funcionário: ");
        double salário = scan.nextDouble();

        System.out.println("Digite o cargo do funcionário: ");
        String cargo = scan.nextLine();

        System.out.println("Digite a data de entrada do funcionário na empresa: ");
        String EntradaEmpresa = scan.nextLine();

        System.out.println("Digite o número da conta bancária do funcionário: ");
        String ContaBanco = scan.nextLine();

        // Criando um novo objeto Funcionario
        Funcionario funcionario = new Funcionario(CPF, nome, NIS, RG, DataNascimento, email, endereço, escolaridade, salário, cargo, EntradaEmpresa, ContaBanco);

        // Imprimindo as informações do funcionário
        System.out.println("Informações do funcionário: ");
        System.out.println("CPF: " + funcionario.CPF);
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("NIS: " + funcionario.NIS);
        System.out.println("RG: " + funcionario.RG);
        System.out.println("Data de nascimento: " + funcionario.DataNascimento);
        System.out.println("Email: " + funcionario.email);
        System.out.println("Endereço: " + funcionario.endereço);
        System.out.println("Escolaridade: " + funcionario.escolaridade);
        System.out.println("Salário: " + funcionario.salário);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Data de entrada na empresa: " + funcionario.EntradaEmpresa);
        System.out.println("Número da conta bancária: " + funcionario.ContaBanco);

        scan.close();
    }
}
