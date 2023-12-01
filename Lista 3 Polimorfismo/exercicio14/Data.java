package exercicio14;

public class Data {
    int dia;
    int mes;
    int ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
    }

    public static void main(String[] args) {
        Data data = new Data();
        System.out.println(data);
    }

}

