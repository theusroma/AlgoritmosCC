import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Pizza de Calabresa");
        lista.add("Pizza de Queijo");
        lista.add("Pizza de Frango");

        // Exibindo os elementos
        System.out.println("Cardápio: " + lista);
        System.out.println();

        // Removendo um elemento
        lista.remove("Pizza de Queijo");
        System.out.println();

        // Mostrando após a remoção
        System.out.println("Cardápio atualizado: " + lista);
        System.out.println();

        // Acessando um elemento pelo índice
        System.out.println("Primeira pizza: " + lista.get(0));
    }
}
