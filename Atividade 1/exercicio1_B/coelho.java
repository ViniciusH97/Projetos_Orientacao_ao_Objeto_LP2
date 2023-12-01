package exercicio1_B;

import java.util.Date;

public class coelho extends animal{

    public int cenourasPorDia;
    public boolean peloLongo;

    public coelho(String raca, String cor, double preco, Date nascimento, int cenourasPorDia, boolean peloLongo){
        super(raca, cor, preco, nascimento);

        this.cenourasPorDia = cenourasPorDia;
        this.peloLongo = peloLongo;
    }
    
}
