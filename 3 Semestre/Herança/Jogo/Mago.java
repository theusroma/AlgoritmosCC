public class Mago extends Personagem{
    Mago(String nome, float vida) {
        super(nome, vida);
    }

    @Override
    void atacar(Personagem alvo) {
        int dano = 90;
        System.out.println(nome + " conjura um feitiço!");
        System.out.println("Dano causado: "+ dano);
        alvo.receberDano(dano);
    }

}
