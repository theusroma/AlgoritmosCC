import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Multiplique um númer por 2

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        int dobro = numero * 2;

        System.out.println("O dobro de " + numero + " é " + dobro);

    }
}
