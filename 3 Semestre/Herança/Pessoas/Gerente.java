public class Gerente extends Funcionario{

    int tamanhoEquipe;
    Gerente(String cpf, String nome, String cargo, float salario, int tamanhoEquipe) {
        super(cpf, nome, cargo, salario);
        this.tamanhoEquipe = tamanhoEquipe;
    }

    void liderar(){

        System.out.println("Gerente: " + this.nome);
        System.out.println("Está liderando uma equipe de " + this.tamanhoEquipe + " pessoas");
        System.out.println("Cargo " + this.cargo);
        System.out.println("Salario R$ " + this.salario);

    }
}
