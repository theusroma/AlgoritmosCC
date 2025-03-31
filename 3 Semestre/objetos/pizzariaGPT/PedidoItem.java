public class PedidoItem {
    private Pizza pizza; // A pizza do pedido
    private String tamanho; // O tamanho da pizza
    private String endereco; // O endereço de entrega

    // Construtor da classe PedidoItem
    public PedidoItem(Pizza pizza, String tamanho, String endereco) {
        this.pizza = pizza;
        this.tamanho = tamanho;
        this.endereco = endereco;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public String getEndereco() {
        return endereco;
    }

    // Exibe os detalhes do pedido
    public void exibirDados() {
        System.out.println("Pizza: " + pizza.getNome() + " | Tamanho: " + tamanho + " | Endereço: " + endereco);
    }
}
