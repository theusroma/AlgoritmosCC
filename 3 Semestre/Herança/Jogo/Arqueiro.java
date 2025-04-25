public class Arqueiro extends Personagem{
    Arqueiro(String nome, float vida) {
        super(nome, vida);
    }

    @Override
    void atacar(Personagem alvo) {
        int dano = 50;
        System.out.println(nome + " lança flechas!");
        System.out.println("Dano causado: "+ dano);
        alvo.receberDano(dano);
    }
}
