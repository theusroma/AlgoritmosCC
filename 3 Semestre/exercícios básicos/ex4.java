import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Mostre o antecessor e o sucessor dos números

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leitor.nextInt();
        
        int suc = num + 1;
        int ant = num - 1;

        System.out.println("O antecessor de " + num + " é " + ant);
        System.out.println();
        System.out.println("O sucessor de " + num + " é " + suc);

    }
}
