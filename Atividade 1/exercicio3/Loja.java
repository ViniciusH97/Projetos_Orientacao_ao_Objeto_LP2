package exercicio3;
@SuppressWarnings("unused")

public class Loja {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", 29.99, "J.R.R. Tolkien");
        CD cd1 = new CD("Greatest Hits", 15.99, 20);
        DVD dvd1 = new DVD("Filme A", 9.99, 120);

        Livro livro2 = new Livro("Dom Quixote", 24.99, "Miguel de Cervantes");
        CD cd2 = new CD("Pop Hits", 12.99, 15);

        System.out.println("Produtos na loja:");
        System.out.println("Livro: " + livro1.getNome() + " (Autor: " + livro1.getAutor() + ")");
        System.out.println("Preço: R$" + livro1.getPreco());

        System.out.println("CD: " + cd1.getNome() + " (Faixas: " + cd1.getNumFaixas() + ")");
        System.out.println("Preço: R$" + cd1.getPreco());

        System.out.println("DVD: " + dvd1.getNome() + " (Duração: " + dvd1.getDuracao() + " minutos)");
        System.out.println("Preço: R$" + dvd1.getPreco());
    }
}