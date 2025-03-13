

NUMEROS MAIOR, MENOR E IGUAL A MEDIA

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Construa um programa que leia em um vetor uma sequência de 5 números
        //digitados pelo usuário, calcule a média destes valores em um outro vetor, e
        //depois apresente na tela quais valores são menores, iguais ou superiores à
        //média.

        int[] numeros = new int[5]; //assim declara
        int i, media;


        for (i=0; i < numeros.length; i++){
            System.out.println("Digite o número "+ i);
             numeros[i] = leitor.nextInt();
        }

        media = (numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4]) / 5;
        System.out.println("A média é: " + media);

        for (i=0; i < numeros.length; i++){
            System.out.println("O número do vetor é: " + numeros[i]);
        }
        System.out.println("");
        //NUMEROS MAIORES QUE A MEDIA
        for (i=0; i < numeros.length; i++){
            if (numeros[i] > media) {
                System.out.println("Números maiores que a média: " + numeros[i]);
            }
        }
        System.out.println("");
        //NUMEROS MENORES QUE A MEDIA
        for (i=0; i < numeros.length; i++){
            if (numeros[i] < media) {
                System.out.println("Números menores que a média: " + numeros[i]);
            }
        }

        System.out.println("");

        //NUMEROS IGUAIS A MEDIA
        for (i=0; i < numeros.length; i++){
            if (numeros[i] == media) {
                System.out.println("Números maiores que a média: " + numeros[i]);
            }
        }




        System.out.println("Hello world!");
    }
}
