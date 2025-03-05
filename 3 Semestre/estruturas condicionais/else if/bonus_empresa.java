import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Programa que calcula a porcentagem de bonus de uma empresa dependendo do tempo trabalhado

        int tempo;
        float bonus;
        float salario;
        float soma;

        System.out.println("Digite seu salário atual: ");
        salario = leitor.nextFloat();
        leitor.nextLine(); // Limpa o buffer


        System.out.println("Digite seu tempo de serviço: ");
        tempo = leitor.nextInt();
        leitor.nextLine(); // Limpa o buffer


        if (tempo <1 ){
            System.out.println("Sem bônus");
        }

        else if (tempo >= 1 && tempo <= 3){
            bonus = salario * 0.05f;
            soma = salario + bonus;
            System.out.println("Seu bônus é: "+bonus);
            System.out.println("Salário com bônus: "+soma);
        }

        else if (tempo >= 4 && tempo <= 6){
            bonus = salario * 0.1f;
            soma = salario + bonus;
            System.out.println("Seu bônus é: "+bonus);
            System.out.println("Salário com bônus: "+soma);
        }

        else{
            bonus = salario * 0.15f;
            soma = salario + bonus;
            System.out.println("Seu bônus é: "+bonus);
            System.out.println("Salário com bônus: "+soma);
        }





        }
    }
