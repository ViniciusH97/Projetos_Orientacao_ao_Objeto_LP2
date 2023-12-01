package exercicio9;

public class Cliente extends Pessoa {

  private String login;
  private String DataPrimeiraCompra;

  public Cliente(String CPF, String nome, String email, String endereço, String login, String DataPrimeiraCompra) {
    super(CPF, nome, email, endereço);
    this.login = login;
    this.DataPrimeiraCompra = DataPrimeiraCompra;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getDataPrimeiraCompra() {
    return DataPrimeiraCompra;
  }

  public void setDataPrimeiraCompra(String DataPrimeiraCompra) {
    this.DataPrimeiraCompra = DataPrimeiraCompra;
  }

}
