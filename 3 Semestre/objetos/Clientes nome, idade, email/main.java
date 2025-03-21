import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in); //declarando Scanner pra que eu possa ler oq o usuario digita
        Cliente[] clientes = new Cliente[2]; //inicializando o vetor

        for (int i = 0; i < clientes.length; i++){
            System.out.println("Digite o nome do cliente: ");
            String nome = leitor.nextLine();


            System.out.println("Digite a idade do cliente: ");
            int idade = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Digite o email do cliente: ");
            String email = leitor.nextLine();

            clientes[i] = new Cliente(nome, email, idade);

        }

        for (int i = 0; i < clientes.length; i++){
            if (clientes[i].idade >= 18){
                clientes[i].apresentar();
            }
        }








    }
}
