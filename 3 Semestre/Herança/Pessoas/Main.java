public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("0", "Pedro");


        Funcionario f = new Funcionario("1111", "Fabricio", "Informática", 3000);
        f.trabalhar();
        System.out.println("");

        Cliente c = new Cliente("2222", "Maria", "maria@gmail.com");
        Cliente c2 = new Cliente("2221", "Carlos", "carlos@gmail.com");
        c.comprar();
        c2.comprar();
        System.out.println("");


        Gerente g = new Gerente("3333", "Gabriel", "gerente", 4000, 32);
        g.liderar();
        g.trabalhar();
        System.out.println("");

        Vendedor v = new Vendedor("4444", "Vinicius", "traba", 2000, 600, 534);
        v.trabalhar();
        v.meta();
        v.vendas();



    }
}