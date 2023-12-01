package exercicio14;

public class Pessoa {

  private String CPF;
  private String nome;
  private String email;
  private String endereço;

  public Pessoa(String CPF, String nome, String email, String endereço) {
    this.CPF = CPF;
    this.nome = nome;
    this.email = email;
    this.endereço = endereço;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEndereço() {
    return endereço;
  }

  public void setEndereço(String endereço) {
    this.endereço = endereço;
  }

}
