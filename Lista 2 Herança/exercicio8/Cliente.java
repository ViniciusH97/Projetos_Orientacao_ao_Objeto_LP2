package exercicio8;

public class Cliente {

  private String CPF;
  private String nome;
  private String login;
  private String email;
  private String rg;
  private String endereço;
  private String DataPrimeiraCompra;

  public Cliente(String CPF, String nome, String login, String email, String rg, String endereço, String DataPrimeiraCompra) {
    this.CPF = CPF;
    this.nome = nome;
    this.login = login;
    this.email = email;
    this.rg = rg;
    this.endereço = endereço;
    this.DataPrimeiraCompra = DataPrimeiraCompra;
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

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getRG() {
    return rg;
  }

  public void setRG(String rg) {
    this.rg = rg;
  }

  public String getEndereço() {
    return endereço;
  }

  public void setEndereço(String endereço) {
    this.endereço = endereço;
  }

  public String getDataPrimeiraCompra() {
    return DataPrimeiraCompra;
  }

  public void setDataPrimeiraCompra(String DataPrimeiraCompra) {
    this.DataPrimeiraCompra = DataPrimeiraCompra;
  }
  
}
