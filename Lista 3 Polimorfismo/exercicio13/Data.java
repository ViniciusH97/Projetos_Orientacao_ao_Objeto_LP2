package exercicio13;

public class Data {
    int mes;
    int dia;
    int ano;
    //construtor
    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    
    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getAno() {
        return ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.mes, this.dia, this.ano);
    }

    public static void main(String[] args) {
        Data data = new Data(12, 31, 2020);
        System.out.println(data);
    }

    

}

