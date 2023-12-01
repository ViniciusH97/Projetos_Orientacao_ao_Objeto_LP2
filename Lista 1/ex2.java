import java.util.Scanner;
import java.io.IOException;
@SuppressWarnings("unused")

public class ex2 {
    public static void main(String[] arg){
        limpar();
        System.out.println("Programa para calcular a área do triangulo, circulo, trapézio, quadrado, retângulo.");
        System.out.println("Digite o valores das respectivas variáveis\n");

        Scanner scan = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);

        System.out.println("Digite o comprimento:");        
        double a = scan.nextDouble();
        System.out.println("Digite a largura:");
        double b = scan.nextDouble();
        System.out.println("Digite a altura/diâmetro:");
        double c = scan.nextDouble();

        System.out.println("Pressione Enter para continuar...");
        pause.nextLine();
        limpar();

        double area_triangulo, pi = 3.1415, area_circulo, area_trapezio, area_quadrado, area_retangulo;

        System.out.println("Calculo da area do triangulo:");
        System.out.printf("A = %.0f * %.0f / 2%n", a, c);
        area_triangulo = (a * c) / 2;

        System.out.printf("Area do triangulo: %.2f", area_triangulo); System.out.println("");

        System.out.println("Pressione Enter para continuar...");
        pause.nextLine();
        limpar();

        System.out.println("Calculo da area do circulo:");
        System.out.printf("A = %.4f * %.2f ^2.%n", pi, b);

        area_circulo = pi * (b * b);

        System.out.printf("Area do circulo: %.2f.\n", area_circulo); System.out.println("");

        System.out.println("Pressione Enter para continuar...");
        pause.nextLine();
        limpar();

        System.out.println("Calculo da area do trapézio");
        System.out.println("Obs: Para esse calculo é preciso utilizar a segunda forma da equação do trapézio\nA = (b * h / 2) + (b * h / 2)\n");
        System.out.printf("A = (%.0f * %.0f / 2) + (%.0f * %.0f / 2)\n", b, c, b, c);
        area_trapezio = (b+b) * c / 2;

        System.out.printf("Area do trapezio: %.2f.\n", area_trapezio);

        System.out.println("Pressione Enter para continuar...");
        pause.nextLine();
        limpar();

        System.out.println("Calculo da area do quadrado");
        System.out.printf("A = %.0f^2.%n", b);

        area_quadrado = b * b;

        System.out.println("Area do quadrado: " + area_quadrado);

        System.out.println("Pressione Enter para continuar...");
        pause.nextLine();
        limpar();

        System.out.println("Calculo do retangulo");
        System.out.printf("A = %.0f * %.0f.%n", b, c);

        area_retangulo = b * c;

        System.out.printf("Area do retangulo: %.2f\n" , area_retangulo);

        pause.close(); 
        scan.close();
    }
    public static void limpar() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

}
