public class Pizza {
    private String nome; // Nome da pizza
    private float valor; // Valor da pizza
    private String ingrediente; // Ingredientes da pizza

    // Construtor da classe Pizza
    public Pizza(String nome, float valor, String ingrediente) {
        this.nome = nome;
        this.valor = valor;
        this.ingrediente = ingrediente;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    // Exibe os dados da pizza
    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Valor: " + valor + " | Ingredientes: " + ingrediente);
    }
}
