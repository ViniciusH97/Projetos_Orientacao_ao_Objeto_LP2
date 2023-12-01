package exercicio14;

public class Cliente extends Pessoa {

  private String login;
  private String dataPrimeiraCompra;
  private Data dataDeNascimento;

  public Cliente(String CPF, String nome, String email, String endereco, String login, String dataPrimeiraCompra, Data dataDeNascimento) {
    super(CPF, nome, email, endereco);
    this.login = login;
    this.dataPrimeiraCompra = dataPrimeiraCompra;
    this.dataDeNascimento = dataDeNascimento;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getDataPrimeiraCompra() {
    return dataPrimeiraCompra;
  }
  
  public void setDataPrimeiraCompra(String dataPrimeiraCompra) {
    this.dataPrimeiraCompra = dataPrimeiraCompra;
  }

  public Data getDataDeNascimento() {
    return dataDeNascimento;
  }

  public void setDataDeNascimento(Data dataDeNascimento) {
    this.dataDeNascimento = dataDeNascimento;
  }
}
