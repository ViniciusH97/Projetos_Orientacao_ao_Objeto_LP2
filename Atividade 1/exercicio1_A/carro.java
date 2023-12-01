package exercicio1_A;

public class carro extends veiculo{

    protected int numPortas;
    protected String placa;

    public carro(int ano, String modelo, int numLugares, int comprimento, int numPortas, String placa, String cor){
        super(ano, modelo, numLugares, comprimento, cor);

        this.numPortas = numPortas;
        this.placa = placa;
    }
    
}
