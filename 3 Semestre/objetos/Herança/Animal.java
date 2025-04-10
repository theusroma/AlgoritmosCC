public class Animal {

    protected String nome;


    protected void mudarNome(String novoNome){
        this.nome = novoNome;

    }
    public void mostraNome(){

        System.out.println(this.nome);
    }

    public void fazerSom(){
        System.out.println("som generico");
    }

}
