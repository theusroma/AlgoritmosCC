import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int nota;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sua nota?");
        nota = leitor.nextInt();

        if(nota >= 9){
            System.out.println("Muito bem");
        }else if(nota >= 6){
            System.out.println("Atenção");
        }else if(nota >= 5.75f){
            System.out.println("Até que deu");
        }else{
            System.out.println("Ano que vem");
        }



    }
}
