import java.util.Scanner;
public class ex4{
    public static void main(String[] arg){
        System.out.println("Calculo de horas trabalhadas");
        try (Scanner scan = new Scanner(System.in)) {
            int i=0;

            int[] id = new int[2];
            double[] g_hora = new double[2];
            double[] salario = new double[2];

            while(i<2){
                System.out.println("Digite o número do " + i + "° funcionario:");
                id[i] = scan.nextInt();
                System.out.print("Digite o valor ganho por hora: ");
                g_hora[i] = scan.nextDouble();
                g_hora[i] *= 8;
                salario[i] = (g_hora[i] * 5) * 4;
                i++;
            }
            for(i=0; i<2; i++){
                System.out.printf("O salario dos funcionarios\nNumero: %d, Salario: %.2f.\n\n", id[i], salario[i]);
            }
            scan.close();
        }
    }
}
