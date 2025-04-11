public class Arqueiro extends Personagem{
    Arqueiro(String nome, float vida, float dano) {
        super(nome, vida, dano);
    }
    @Override
    void atacar() {
        System.out.println(nome + " lança flechas!");
    }
}
