public class Mago extends Personagem{
    Mago(String nome, float vida, float dano) {
        super(nome, vida, dano);
    }
    @Override
    void atacar() {
        System.out.println(nome + " connjura um feitiço!");
    }

}
