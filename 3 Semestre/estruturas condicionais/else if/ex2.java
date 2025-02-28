import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade;


        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade e pode votar");
        } else if (idade >=16) {
            System.out.println("Você pode votar porém é menor de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

    }
}
