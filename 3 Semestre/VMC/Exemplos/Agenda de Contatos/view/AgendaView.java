package view;

import java.util.*;
import model.*;
import controller.AgendaController;
import util.InputHelper;

public class AgendaView {

    public static void executar() {
        int opc;
        do {
            opc = mostrarMenu();
            verificarOp(opc);
        } while (opc != 7);
    }

    private static void verificarOp(int opc){
        switch (opc) {
            case 1 -> incluirPessoal();
            case 2 -> incluirComercial();
            case 3 -> incluirContatoUrgente();
            case 4 -> excluir();
            case 5 -> consultar();
            case 6 -> listar();
            case 7 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida!");
        }
    }

    private static int mostrarMenu(){
        System.out.println("\n===== AGENDA DE CONTATOS  =====");
        System.out.println("1. Incluir Pessoal");
        System.out.println("2. Incluir Comercial");
        System.out.println("3. Incluir Contato de Urgência");
        System.out.println("4. Excluir contato");
        System.out.println("5. Consultar contato");
        System.out.println("6. Listar todos");
        System.out.println("7. Sair");

        return InputHelper.lerInt("Escolha: ");
    }

    private static void incluirPessoal() {
        int codigo = InputHelper.lerInt("Código: ");
        String nome = InputHelper.lerString("Nome: ");
        String tel = InputHelper.lerString("Telefone: ");
        String aniv = InputHelper.lerString("Aniversário: ");

        AgendaController.adicionarPessoal(codigo, nome, tel, aniv);
        System.out.println("Contato pessoal adicionado!");
    }

    private static void incluirComercial() {
        int codigo = InputHelper.lerInt("Código: ");
        String nome = InputHelper.lerString("Nome: ");
        String tel = InputHelper.lerString("Telefone: ");
        String cnpj = InputHelper.lerString("CNPJ: ");

        AgendaController.adicionarComercial(codigo, nome, tel, cnpj);
        System.out.println("Contato comercial adicionado!");
    }

    private static void incluirContatoUrgente(){
        int codigo = InputHelper.lerInt("Código: ");
        String nome = InputHelper.lerString("Nome: ");
        String tel = InputHelper.lerString("Telefone: ");
        String prioridade = InputHelper.lerString("Prioridade: ");

        AgendaController.adicionarUrgente(codigo, nome, tel, prioridade);
        System.out.println("Contato de urgência adicionado!");
    }

    private static void excluir() {
        int cod = InputHelper.lerInt("Código: ");

        if (AgendaController.excluirContato(cod))
            System.out.println("Contato removido.");
        else
            System.out.println("Contato não encontrado.");
    }

    private static void consultar() {
        int cod = InputHelper.lerInt("Código: ");
        Contato c = AgendaController.buscarContato(cod);

        if(c != null)
            System.out.println(c);
        else
            System.out.println("Contato não encontrado.");
    }

    private static void listar() {
        for (Contato c : AgendaController.listarContatos()) {
            System.out.println(c);
        }
    }
}
