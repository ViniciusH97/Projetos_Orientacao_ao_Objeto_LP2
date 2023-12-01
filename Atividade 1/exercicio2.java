import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        // Declaração de variáveis
        double peso, altura, imc;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        peso = scanner.nextDouble();

        System.out.print("Digite a altura (em m): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25) {
            classificacao = "Normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau 1";
        } else if (imc < 40) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }

        System.out.printf("O IMC é: %.2f", imc);
        System.out.println("\nClassificação: " + classificacao);
        scanner.close();
    }

}
