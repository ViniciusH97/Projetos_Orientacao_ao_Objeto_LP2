import java.util.Scanner;

public class exercicio6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner pausa = new Scanner(System.in);

        int op;
        double x, y, rst;
        String resp = "";

        do{
            menu();
            op = scan.nextInt();
            scan.nextLine();

            switch(op){

                case 1:

                    System.out.println("Digite os valores para soma");
                    System.out.print("Valor 1: "); 
                    x = scan.nextDouble();
                    System.out.print("Valor 2: "); 
                    y = scan.nextDouble(); rst = x + y; 
                    System.out.println("Resultado: " + rst);

                    System.out.println("Pressione qualquer tecla para continuar");
                    pausa.nextLine();
                    
                    System.out.printf("Deseja executar outra operação? S/N\n");
                    scan.nextLine();
                    resp = scan.nextLine();

                    
                break;

                case 2:

                    System.out.println("Digite os valores para a subtração");
                    System.out.println("Valor 1: "); 
                    x = scan.nextDouble();
                    System.out.println("Valor 2: "); 
                    y = scan.nextDouble(); 
                    rst = x - y;
                    System.out.println("Resultado: " + rst);

                    System.out.println("Pressione qualquer tecla para continuar");
                    pausa.nextLine();

                    System.out.printf("Deseja executar outra operação? S/N\n", rst);
                    scan.nextLine();
                    resp = scan.nextLine();

                break;

                case 3:

                    System.out.println("Digite os valores para a multiplicação");
                    System.out.println("Valor 1:");
                    x = scan.nextDouble();
                    System.out.println("Valor 2:");
                    y = scan.nextDouble();
                    rst = x * y;
                    System.out.println("Resultado: " + rst);

                    System.out.println("Pressione qualquer tecla para continuar");
                    pausa.nextLine();

                    System.out.printf("Deseja executar outra operação? S/N\n", rst);
                    scan.nextLine();
                    resp = scan.nextLine();

                break;

                case 4:

                    System.out.println("Digite os valores para a divisão");
                    System.out.println("Valor 1:");
                    x = scan.nextDouble();
                    System.out.println("Valor 2:");
                    y = scan.nextDouble();;
                    rst = x / y;
                    System.out.println("Resultado: " + rst);

                    System.out.println("Pressione qualquer tecla para continuar");
                    pausa.nextLine();

                    System.out.printf("Deseja executar outra operação? S/N\n", rst);
                    scan.nextLine();
                    resp = scan.nextLine();

                break;

                case 5:
                    System.out.println("Saindo...");
                break;

                default: 
                    System.out.println("Opção invalida!");
                    System.out.println("Digite uma opção valida.");
                break;
            }
            
        }while(!(op == 5 || resp.equalsIgnoreCase("n")));

        System.out.println("Programa encerrado!");
        scan.close();
        pausa.close();
    }
    static void menu(){
        System.out.print("\033[H\033[2J"); // limpa o terminal
        System.out.println("__________CALCULADORA____________\n");
        System.out.println("Opções:\n1 - Soma\n2 - Subtração\n3 - Multiplicacão\n4 - Divisão\n5 - Sair");

    }

}
