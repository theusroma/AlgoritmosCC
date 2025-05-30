package controller;

import model.*;
import java.util.List;

public class AgendaController {

    public static void adicionarPessoal(int codigo, String nome, String telefone, String aniversario) {
        Agenda.adicionar(new Pessoal(codigo, nome, telefone, aniversario));
    }

    public static void adicionarComercial(int codigo, String nome, String telefone, String cnpj) {
        Agenda.adicionar(new Comercial(codigo, nome, telefone, cnpj));
    }

    public static void adicionarUrgente(int codigo, String nome, String telefone, String prioridade){
        Agenda.adicionar(new ContatoUrgente(codigo, nome, telefone, prioridade));
    }

    public static boolean excluirContato(int codigo) {
        return Agenda.excluirContato(codigo);
    }

    public static Contato buscarContato(int codigo) {
        return Agenda.getContato(codigo);
    }

    public static List<Contato> listarContatos() {
        return Agenda.listarContatos();
    }
}
