public class Vendedor extends Funcionario{

    float meta;
    float vendas;

    Vendedor(String cpf, String nome, String cargo, float salario, float meta, float vendas) {
        super(cpf, nome, cargo, salario);
        this.meta = meta;
        this.vendas = vendas;
    }

    void meta(){
        System.out.println("A meta é de: " + meta);
    }

    void vendas(){
        System.out.println("A venda atual é de: " + vendas);
    }

}
