package exercicio1_A;

public class aviao extends veiculo{

    protected int numTurbinas;
    protected String prefixo;

    public aviao(int ano, String modelo, int numLugares, int numTurbinas, String prefixo, int comprimento, String cor){
        super(ano, modelo, numLugares, comprimento, cor);
        
        this.numTurbinas = numTurbinas;
        this.prefixo = prefixo;
    }
    
}
