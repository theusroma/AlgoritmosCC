public class Cliente extends Pessoa{

    String email;
    Cliente(String cpf, String nome, String email){
        super(cpf, nome);
        this.email = email;
//        this.cpf = cpf;
//        this.nome = nome;
    }

    void comprar(){
        System.out.println("Cliente " + this.nome + " fazendo compras...");
        System.out.println("...enviar comprovante para " + this.email);
    }
}
