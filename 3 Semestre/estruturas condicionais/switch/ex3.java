import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int saldoatual;
        int op;
        int saldo = 0;
        int saque;
        int deposito;
        int menu;

        System.out.println("Digite o saldo atual: ");
        saldo = leitor.nextInt();

        System.out.println("1 - Ver saldo: ");
        System.out.println("2 - Sacar: ");
        System.out.println("3 - Depositar: ");
        System.out.println("4 - Sair: ");
        menu = leitor.nextInt();

        switch (menu){
            case 1:
                System.out.println("O saldo é de: " + saldo);
                break;

            case 2:
                System.out.println("Digite o valor do saque: ");
                saque = leitor.nextInt();
                saldo = saldo - saque;
                break;

            case 3:
                System.out.println("Digite o valor do depósito: ");
                deposito = leitor.nextInt();
                saldo = saldo + deposito;
                break;

            case 4:
                System.out.println("Obrigado e adeus");
                break;

            default:
                System.out.println("ERRO");
                break;
        }



    }
}
