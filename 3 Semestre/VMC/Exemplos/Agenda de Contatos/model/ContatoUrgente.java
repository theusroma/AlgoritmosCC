package model;

public class ContatoUrgente extends Contato{
    private String prioridade;

    public ContatoUrgente(int codigo, String nome, String telefone, String prioridade){
        super(codigo, nome, telefone);
        this.prioridade = prioridade;
    }


    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;
    }

    @Override
    public String toString(){
        return "[URGENTE] "+codigo+" - "+nome+" - "+telefone+"[Prioridade] "+prioridade;
    }
}
