import java.util.Scanner;
@SuppressWarnings("Unused")

public class exercicio11 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Soma e multiplicação de dois valores ou três");
        System.out.println("Quantos valores deseja usar na operação?");
        int quant, i=0, escolha, soma=0, mult=1;
        quant = scan.nextInt();
        int[] valores = new int[quant];
        
        
        while(i != quant){
            System.out.print("Digite o valor " + (i + 1) + ":");
            valores[i] = scan.nextInt();
            i++;
        }

        System.out.print("\nQual operação deseja?\n1 = Soma.\n2 = Multiplicação.\n");
        escolha  = scan.nextInt();

        switch (escolha) {
            case 1:
                i=0;
                while(i != quant){
                    soma += valores[i];
                    i++;
                }
            break;
                
            case 2:
                i=0;
                while(i != quant){
                    mult *= valores[i];
                    i++;
                }
            break;

            default:
                System.out.println("Opção invalida!");
            break;
        }

        if (escolha == 1){    
            System.out.print("\nSoma : " + soma);
        }else if (escolha == 2){
            System.out.println("\nMultiplicação: " + mult);
        }

        scan.close();

    }
}
