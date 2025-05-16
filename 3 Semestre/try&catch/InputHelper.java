import java.util.Scanner;

public class InputHelper {


    static Scanner scan = new Scanner(System.in);

    public static int pegarNumeroNaRange(String texto, int de, int ate) {

        int num = -1;

        do{
            num = pegarNumeroInt(texto);
        }while (num < de || num > ate);

        return num;
    }



    public static int pegarNumeroInt(String texto){
        int num = -1;
        boolean erro = false;

        do {
            System.out.println(texto);

            try {
                num = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                erro = false;
                System.out.println(e);
                System.out.println("\u001B[31m Digite um numero valido: \u001B[0m");
                System.out.println();
            }
        } while (erro);


        return num;
    }
}
