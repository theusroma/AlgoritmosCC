import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Programa para uma academia, deve calcular o IMC

        float peso;
        float altura;
        float imc;

        System.out.println("Digite seu peso: ");
        peso = leitor.nextFloat();
        leitor.nextLine(); // Limpa o buffer

        System.out.println("Digite sua altura: ");
        altura = leitor.nextFloat();
        leitor.nextLine(); // Limpa o buffer

        imc = peso / (altura*altura);

        if (imc <= 18.5){
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Classificação: ABAIXO DO PESO");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Classificação: PESO IDEAL");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Classificação: SOBREPESO");
        }
        else{
            System.out.println("Seu IMC é: " + imc);
            System.out.println("Classificação: OBESIDADE");
        }

    }
}
