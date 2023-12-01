package exercicio1_B;

import java.util.Date;

public class cachorro extends animal{

    public double distanciafaro;
    public double intensidadeLatido;
    
    public cachorro(String raca, String cor, double preco, Date nascimento, double distanciafaro, double intensidadeLatido){
        super(raca, cor , preco, nascimento);

        this.distanciafaro = distanciafaro;
        this.intensidadeLatido = intensidadeLatido;

    }
    
}
