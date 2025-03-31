import java.util.ArrayList;

public class Pedido {
    private ArrayList<PedidoItem> pedidos; // Lista de pedidos
    private ArrayList<Pizza> pizzas; // Lista de pizzas disponíveis no cardápio

    public Pedido() {
        pizzas = new ArrayList<>();
        pedidos = new ArrayList<>();

        // Adicionando pizzas padrão
        pizzas.add(new Pizza("Margarita", 30.0f, "Molho de tomate, queijo, manjericão"));
        pizzas.add(new Pizza("Calabresa", 35.0f, "Molho de tomate, queijo, calabresa"));
        pizzas.add(new Pizza("Portuguesa", 40.0f, "Molho de tomate, queijo, presunto, ovo, azeitona"));
        pizzas.add(new Pizza("Quatro Queijos", 45.0f, "Molho de tomate, queijo mussarela, queijo prato, queijo parmesão, queijo gorgonzola"));
    }

    public void cardapio() {
        if (pizzas.isEmpty()) {
            System.out.println("Não há pizzas disponíveis no cardápio.");
        } else {
            for (Pizza p : pizzas) {
                p.exibirDados();
            }
        }
        System.out.println();
    }

    public void adicionarPedido(String nome, String tamanho, String endereco) {
        for (Pizza p : pizzas) { // Verifica se a pizza está no cardápio
            if (p.getNome().equalsIgnoreCase(nome)) {
                PedidoItem pedido = new PedidoItem(p, tamanho, endereco); // Cria um PedidoItem com a pizza, tamanho e endereço
                pedidos.add(pedido); // Adiciona o pedido à lista de pedidos
                System.out.println("Pedido de pizza adicionado: \nSabor: " + nome + "\nTamanho: " + tamanho + "\nEndereço: " + endereco);
                return;
            }
        }
        System.out.println("Sabor não encontrado no cardápio.");
    }

    public void carrinho() {
        System.out.println("Carrinho: ");

        if (pedidos.isEmpty()) {
            System.out.println("Não há pizzas no carrinho.");
        } else {
            float total = 0;
            for (PedidoItem p : pedidos) {
                p.exibirDados();
                total += p.getPizza().getValor();
            }
            System.out.println("Total: " + total);
            System.out.println();
        }
    }

    public void cancelarPedido(String nome) {
        for (PedidoItem p : pedidos) {
            if (p.getPizza().getNome().equalsIgnoreCase(nome)) {
                pedidos.remove(p);
                System.out.println("Pizza " + nome + " removida do carrinho.");
                return;
            }
        }
        System.out.println("Pedido não encontrado.");
    }

    public void pedidosRegistrados() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhuma pizza foi registrada até o momento.");
        } else {
            System.out.println("Pedidos registrados:");
            for (PedidoItem p : pedidos) {
                p.exibirDados();
            }
        }
        System.out.println();
    }

    public void cadastrarSabor(String nome, float valor, String ingrediente) {
        pizzas.add(new Pizza(nome, valor, ingrediente)); // Adiciona uma nova pizza ao cardápio
        System.out.println("Sabor cadastrado com sucesso!");
        System.out.println();
    }
}
