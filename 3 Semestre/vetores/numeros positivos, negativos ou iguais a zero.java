
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // Escreva um algoritmo que leia em um vetor uma sequência finita de números
        //digitados pelo usuário e, logo após, mostre o número de cada posição do
        //vetor e se ele é positivo, negativo ou zero.

        int[] numeros; //assim declara
        int i, media, tamanho;

        System.out.println("Digite o tamanho do vetor: ");
        tamanho = leitor.nextInt();

        numeros = new int[tamanho];

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número " + i);
            numeros[i] = leitor.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            System.out.println("O número do índice" + i + "é :" + numeros[i]);
        }


            System.out.println("");
            //NUMEROS POSITIVOS
            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    System.out.println("Números positivos: " + numeros[i]);
                }
            }
            System.out.println("");

            //NUMEROS NEGATIVOS
            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] < 0) {
                    System.out.println("Números negativos: " + numeros[i]);
                }
            }
            System.out.println("");

            //NUMEROS IGUAIS A 0
            for (i = 0; i < numeros.length; i++) {
                if (numeros[i] == 0) {
                    System.out.println("Números iguais a 0: " + numeros[i]);
                }
            }


            System.out.println("Hello world!");
        }
    }
