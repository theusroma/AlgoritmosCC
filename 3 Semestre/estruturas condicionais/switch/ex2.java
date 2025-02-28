import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int dia;

        System.out.println("Digite o mês: ");
        dia = leitor.nextInt();

        switch (dia){
            case 1:
                System.out.println("Janeiro");
                break;

            case 2:
                System.out.println("Fevereiro");
                break;

            case 3:
                System.out.println("Março");
                break;

            case 4:
                System.out.println("Abril");
                break;

            case 5:
                System.out.println("Maio");
                break;

            default:
                System.out.println("Esse numero nao representa nenhum mes");
                break;
        }



    }
}
