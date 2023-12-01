package exercicio1_A;

public class lancha extends veiculo{
    protected int numMotores;
    
    public lancha(int ano, String modelo, int numLugares, int numMotores, int comprimento, String cor){
        super(ano, modelo, numLugares, comprimento, cor);

        this.numMotores = numMotores;
    }
}
