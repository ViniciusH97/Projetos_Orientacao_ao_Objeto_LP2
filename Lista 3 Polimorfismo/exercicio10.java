import java.util.Scanner;
import java.lang.Math;

public class exercicio10 { 
    public static void main(String args[] ) throws InterruptedException{
        try (Scanner scan = new Scanner(System.in)) {
            int a, b, c, maior, menor, media;

            System.out.println("Este programa mostrará qual é o número maior, menor e a média");
            Thread.sleep(1500);

            System.out.println("Digite três valores inteiros");
            System.out.print("a : ");
            a = scan.nextInt();
            System.out.print("\nb : ");
            b = scan.nextInt();
            System.out.print("\nc : ");
            c = scan.nextInt();

            media = (a + b + c)/3;

            maior = Math.max(a,b);
            maior = Math.max(maior,c);

            System.out.println("Maior: " + maior);

            if (a == b){
                System.out.println("Os valores são iguais");
            }

            menor = Math.min(a,b);
            menor = Math.min(menor,c);

            System.out.println("Menor: " + menor);

            System.out.println("A media é : " + media);

            scan.close();
        }
    }
}
