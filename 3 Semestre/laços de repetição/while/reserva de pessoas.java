import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int pessoas;
        //




        System.out.println("Olá quantas pessoas?");
        pessoas = leitor.nextInt();
        leitor.nextLine();

        while (pessoas <1 || pessoas >5) {
            System.out.println("Assim nao dá!!");
           // System.out.println("");
            System.out.println("TENTE NOVAMENTE!!");

            pessoas = leitor.nextInt();
        }


        System.out.println("Obrigado pela reserva");


leitor.close();

    }
}
