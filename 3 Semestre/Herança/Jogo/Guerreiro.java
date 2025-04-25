public class Guerreiro extends Personagem{
    Guerreiro(String nome, float vida) {
        super(nome, vida);
    }

    @Override
    void atacar(Personagem alvo) {
        int dano = 30;
        System.out.println(nome + " ataca com espada!");
        System.out.println("Dano causado: "+ dano);
        alvo.receberDano(dano);
    }
}
