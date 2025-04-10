public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Cliente c = new Cliente();
        Vendedor v = new Vendedor();

        System.out.println("Funcionario: ");
        f.fazerSom();
        f.mudarNome("Fabricio");
        f.mostrarNome();
        f.mudarCpf("111111111");
        f.mostraCpf();
        System.out.println("");

        System.out.println("Cliente:");
        c.fazerSom();
        c.mudarNome("Carlos");
        c.mostrarNome();
        c.mudarCpf("222222222");
        c.mostraCpf();
        System.out.println("");

        System.out.println("Gerente:");
        g.fazerSom();
        g.mudarNome("Geraldo");
        g.mostrarNome();
        g.mudarCpf("33333333");
        g.mostraCpf();
        System.out.println("");

        System.out.println("Vendedor:");
        v.fazerSom();
        v.mudarNome("Vinicius");
        v.mostrarNome();
        v.mudarCpf("444444444");
        v.mostraCpf();
        System.out.println("");

    }
}