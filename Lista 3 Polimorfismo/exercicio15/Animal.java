package exercicio15;

public class Animal {
    int idade;
    int peso;

    public Animal(int idade, int peso, int membros) {
        this.idade = idade;
        this.peso = peso;
    }

    public void emitirSom() {
        System.out.println("Som de animal");
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return String.format("Idade: %d\nPeso: %d", this.idade, this.peso);
    }

    class Passaro extends Animal {
        public Passaro(int idade, int peso) {
            super(idade, peso, 2);
        }

        @Override
        public void emitirSom() {
            System.out.println("Som de passaro");
        }
    }

    public class Mamifero{
        String habitat;
        
    }
    
    public class Cachorro extends Mamifero{
        public Cachorro(int idade, int peso) {

        }

    }

}
