package View;

import Contoller.CadastroAluno;
import Model.Aluno;

import java.util.Scanner;

public class Sistema {

    public static void executar(){
        int op;
        Scanner scan = new Scanner(System.in);

        do {

            mostrarMenu();
            op = scan.nextInt();
            scan.nextLine();

            op = InputHelper.lerInt("opcao");

        }while (op != 0);

    }

    public static void mostrarMenu(){
        System.out.println("---------");
        System.out.println("Bem Vindo!");
        System.out.println("> 1 - Criar Aluno");
        System.out.println("> 2 - Listar Alunos");
        System.out.println("> 0 - Sair");
    }

    public static void verificarOpcao(int op){

        switch (op){
            case 1 -> cadastrarAluno();

            case 2 -> listarAluno();

            case 0 -> System.out.println("Saindo...");

            default -> System.out.println("Erro!!!");


        }
    }

    private static void listarAluno() {
        System.out.println("-----------------");
        System.out.println("--- Lista de Alunos ---");

        if (CadastroAluno.listaVazia()){
            System.out.println("<Nenhum aluno no sistema");
        } else{
            for (int i = 0; i < CadastroAluno.listaDeAlunos().size(); i++) {
                Aluno al = CadastroAluno.listaDeAlunos().get(i);
                System.out.println(" > " + al.getNome());
            }

            for(Aluno al : CadastroAluno.listaDeAlunos()){
                System.out.println(al.getNome());
            }


        }
    }

    private static void cadastrarAluno() {
        int mat = InputHelper.lerInt(">>Matricula: ");
        String nome = InputHelper.lerString(">>Nome: ");
        String email = InputHelper.lerString(">>Email: ");

        //op1
        Aluno novo = new Aluno(nome, email, mat);
        CadastroAluno.cadastrarAluno(novo);

        //op2


        //op3

    }


}
