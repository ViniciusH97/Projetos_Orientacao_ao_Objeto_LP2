package exercicio1_B;

import java.util.Date;

public class gato extends animal{

    public boolean peloLongo;
    public double alturaPulo;

    public gato(String raca, String cor, double preco, Date nascimento, boolean peloLongo, double alturaPulo){
        super(raca, cor, preco, nascimento);

        this.peloLongo = peloLongo;
        this.alturaPulo = alturaPulo;
    }
    
}
