import java.util.Scanner;
public class ex1{
    public static void main(String[] arg) {
        System.out.println("Soma dois numeros");
        System.out.println("Digite dois numeros: ");
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        int total = x + y;

        System.out.print("O total da soma é: " + total);

        scan.close();
    }
}