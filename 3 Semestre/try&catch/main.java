import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("nome: ");
            String nome = scan.nextLine();
            int idade = InputHelper.pegarNumeroInt("idade: ");
            int peso = InputHelper.pegarNumeroInt("peso: ");
            int ate = InputHelper.pegarNumeroNaRange("Numero de 1 a 8: ", 1, 8);



//            try {
//                System.out.printf("idade: ");
//                int idade = Integer.parseInt(scan.nextLine());
//
//                System.out.println("Peso: ");
//                float peso = Integer.parseInt(scan.nextLine());
//
//
//            } catch (NumberFormatException e) {
//                System.out.println("Digite apenas números...");
//                System.out.println("Digite novamente");
//
//            } catch (Exception e) {
//            System.out.println("ERRO");
//        }
//
        }
    }
}
