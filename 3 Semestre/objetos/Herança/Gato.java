public class Gato extends Animal{

    public void mudarNomeDoGato(String novoNome){
//        this.nome = "Gato > " + novoNome;
        mudarNome("Gato: " + novoNome);
        System.out.println(this.nome);
    }

    @Override
    public void fazerSom() {
//        super.fazerSom();
        System.out.println("miau");
    }
}
