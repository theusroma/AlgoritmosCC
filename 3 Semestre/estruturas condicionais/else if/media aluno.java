import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Matricula: ");
        String matricula = leitor.nextLine();

        System.out.println("Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.println("Nota 2: ");
        float nota2 = leitor.nextFloat();

        float media = (nota1 + nota2) / 2;
      //  boolean aprovado = notaFinal >= 6.0f;

        if (media >= 6.0f){
            System.out.println("Matricula: " + matricula);

            System.out.println("Nome: " + nome);


            System.out.println("Nota Final: " + media);

            System.out.println("APROVADO(X)   REPROVADO()");

        }else {
            System.out.println("Matricula: " + matricula);

            System.out.println("Nome: " + nome);


            System.out.println("Nota Final: " + media);

            System.out.println("APROVADO()   REPROVADO(X)");
        }

        // System.out.println("");

    }
}
