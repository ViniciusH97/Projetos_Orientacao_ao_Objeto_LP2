import java.util.Scanner;
import java.lang.Math;

@SuppressWarnings("unused")

public class exercicio7 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("\033[H\033[2J"); // limpa o terminal

            int op;
            double a, b, h, res, pi=13.14159;
            String response = "";

            do{
                System.out.print("\033[H\033[2J");
                System.out.println("   Cálculos Geométricos    \n");
                System.out.println("Escolha uma opção abaixo:\n\n1- Área do triângulo\n2- Área do círculo\n3- Área do trapézio\n4- Área do quadrado\n5- Área do retângulo.\n6- Sair");     
                op = scan.nextInt();

                switch(op){

                    case 1:
                        System.out.println("    AREA DO TRIANGULO    \n");
                        System.out.print("Digite a base.\nA: ");
                        a = scan.nextDouble();
                        System.out.print("Digite a altura\nC: ");
                        h = scan.nextDouble();

                        // a * h / 2
                        res = (a * h) / 2;

                        System.out.printf("Resultado: %.2f\n", res);

                        System.out.println("Deseja selecionar outro calculo de area? S/N");
                        scan.nextLine();
                        response = scan.nextLine();

                    break;

                    case 2:
                        System.out.println("      AREA DO CÍRCULO     \n");
                        System.out.print("Digite o raio: ");
                        h = scan.nextDouble();

                        // a =  pi * h^2
                        res = Math.PI * (h * h);

                        System.out.printf("Resultado: %.2f\n", res);
                        
                        System.out.println("Deseja selecionar outro calculo de area? S/N");
                        scan.nextLine();
                        response = scan.nextLine();

                    break;

                    case 3:
                        System.out.println("   AREA DO TRAPÉZIO   \n");
                        System.out.print("Digite a base maior: ");
                        a = scan.nextDouble();
                        System.out.print("Digite a base menor: ");
                        b = scan.nextDouble();
                        System.out.println("Digite a altura: ");
                        h = scan.nextDouble();
                    
                        // A = (B + b) * h / 2
                        res = ((a + b) * h) / 2;

                        System.out.printf("Resultado: %.2f\n", res);

                        System.out.println("Deseja selecionar outro calculo de area? S/N");
                        scan.nextLine();
                        response = scan.nextLine();
                    break;

                    case 4:
                        System.out.println("      AREA DO QUADRADO    \n");
                        System.out.print("Digite a base");
                        a = scan.nextDouble();
                    
                        // A = a^2
                        res = a * a;
                        System.out.printf("Resultado: %.2f\n", res);

                        System.out.println("Deseja selecionar outro calculo de area? S/N");
                        scan.nextLine();
                        response = scan.nextLine();
                
                    break;

                    case 5:
                        System.out.println("    AREA DO RETANGULO     ");
                        System.out.print("Digite a base: ");
                        a = scan.nextDouble();
                        System.out.print("Digite a altura: ");
                        h = scan.nextDouble();

                        // A = b * h
                        res = a * h;
                    
                        System.out.printf("Resultado: %.2f\n", res);

                        System.out.println("Deseja selecionar outro calculo de area? S/N");
                        scan.nextLine();
                        response = scan.nextLine();
                    break;

                    case 6:
                        System.out.println("Saindo...");
                    break;

                    default:
                        System.out.println("Opção invalida!");
                        System.out.println("Tente outra opção.");
                    break;
                }
            }while(response.equalsIgnoreCase("s"));

            System.out.println("Programa encerrado.");
        }
    }
}
