public class Pessoa {

    public String nome;
    protected String cpf;
    int idade;

    protected void mudarNome(String novoNome){
        this.nome = novoNome;

    }

    public void mostrarNome(){
        System.out.println(this.nome);
    }

    protected void mudarCpf(String novoCpf){
        this.nome = novoCpf;

    }

    public void mostraCpf(){

        System.out.println(this.cpf);
    }

    public void fazerSom(){
        System.out.println("som generico");
    }

}
