package ex5;
import java.util.Scanner;

public class funcionario{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero do funcionario: ");
        int num_func = scan.nextInt();
        
        System.out.println("Digite o número de horas trabalhadas: ");
        double horas_trabalhadas = scan.nextDouble();

        System.out.println("Digite o valor recebido por hora:");
        double v_hora = scan.nextDouble();

        double salario = horas_trabalhadas * v_hora;

        System.out.printf("Funcionario: %d\n", num_func);
        System.out.printf("Salario: %.2f", salario);

        scan.close();
    }
}
