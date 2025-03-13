import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Faça um programa que leia em um vetor uma sequência finita de números
        //digitados pelo usuário. Crie um segundo vetor que armazene o dobro de cada
        //número do primeiro vetor e depois apresente os valores deste vetor.

        int[] primeirovet; //assim declara
        int[] segundovet;
        int i, dobro, tamanho;

        System.out.println("Digite o tamanho do vetor: ");
        tamanho = leitor.nextInt();
        leitor.nextLine();

        primeirovet = new int[tamanho];
        segundovet = new int[tamanho];

        for (i = 0; i < primeirovet.length; i++) {
            System.out.println("Digite o número do índice [" + i + "]: ");
            primeirovet[i] = leitor.nextInt();

            segundovet[i] = primeirovet[i] * 2;
            leitor.nextLine();
        }


        //DOBRO DOS NUMEROS
            for (i = 0; i < primeirovet.length; i++) {
                    System.out.println("Dobro do índice [" + i + "]: " + segundovet[i]);

            }


            System.out.println("Hello world!");
        }
    }
