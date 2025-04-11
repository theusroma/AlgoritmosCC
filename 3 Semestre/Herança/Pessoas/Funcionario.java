public class Funcionario extends Pessoa{

    String cargo;
    float salario;

    Funcionario(String cpf, String nome, String cargo, float salario) {
       super(cpf, nome);
       this.cargo = cargo;
       this.salario = salario;
    }


    void trabalhar(){

        System.out.println("| " + this.nome + " está: ");
        System.out.println("| ~ Trabalhando com " + this.cargo);
        System.out.println("| ~ Ganhando com " + this.salario);

    }

}
