public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
//        a.nome = "toto";
        a.mudarNome("toto");



        Gato g = new Gato();

//        g.nome = "bolota";
//        g.mudarNome("bolotinha");

        g.mudarNomeDoGato("felix");
//        System.out.println(a.nome);
//        System.out.println(g.nome);

        g.mostraNome();
        a.mostraNome();

        a.fazerSom();
        g.fazerSom();


        Cachorro c = new Cachorro();
        c.mudarNome("costelinha");
        c.mostraNome();
        c.fazerSom();


    }
}