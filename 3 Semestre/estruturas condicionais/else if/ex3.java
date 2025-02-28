import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float celsius;
        int opcao;
        float faren;
        float kelvin;

        System.out.println("Digite a temperatura em celsius: ");
        celsius = leitor.nextInt();

        System.out.println("Escolha a conversão: 1  - Farenheit    2 - Kelvin ");
        opcao = leitor.nextInt();

        if (opcao == 1){
            faren = (celsius * (1.8f)) + 32;
            System.out.println("A temperatura em Farenheit é de: " + faren);
        }
        else if (opcao == 2){
            kelvin = celsius + 273.15f;
            System.out.println("A temperatura em Kelvin é de: " + kelvin);
        }


    }
}
