import java.util.Scanner;
@SuppressWarnings("unused")

public class ex3{
    public static void main(String[] args){
        System.out.println("Calculo de horas trabalhadas");
        Scanner scan = new Scanner(System.in);
        int i=0;

        int id; 
        double g_hora, salario; 
        i++;
        
        System.out.println("Digite o número do " + i + "° funcionario:");
        id = scan.nextInt();
        System.out.print("Digite o valor ganho por hora: ");
        g_hora = scan.nextDouble();
        g_hora *= 8;
        salario = (g_hora * 5) * 4;

        System.out.printf("O salario do funcionario %dº é de %.2f\n\n", i, salario);
        scan.close();
    }
}