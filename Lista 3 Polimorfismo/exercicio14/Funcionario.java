package exercicio14;
@SuppressWarnings("unused") // ignora as variáveis não utilizadas

public class Funcionario extends Pessoa {

  private String NIS;
  private String RG;
  private String DataNascimento;
  private String escolaridade;
  private double salário;
  private String cargo;
  private String EntradaEmpresa;
  private String ContaBanco;

  public Funcionario(String CPF, String nome, String email, String endereço, String NIS, String RG, String DataNascimento, String escolaridade, double salário, String cargo, String EntradaEmpresa, String ContaBanco) {
    super(CPF, nome, email, endereço);
    this.NIS = NIS;
    this.RG = RG;
    this.DataNascimento = DataNascimento;
    this.escolaridade = escolaridade;
    this.salário = salário;
    this.cargo = cargo;
    this.EntradaEmpresa = EntradaEmpresa;
  }
}
