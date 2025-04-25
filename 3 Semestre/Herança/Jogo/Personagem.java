public class Personagem {
    String nome;
    float vida, dano;
    Personagem(String nome, float vida){
        this.nome = nome;
        this.vida = vida;

    }
    void mostrarPersonagem(){
        System.out.println("Personagem: "+this.nome);
        System.out.println("Vida: "+this.vida);

    }

    void atacar(Personagem alvo){
    }


    void receberDano(float danoRecebido){
        this.vida = this.vida - danoRecebido;

    }

    void estaVivo(){
        if (this.vida <= 0){
            System.out.println("Está morto!");
        }
        else System.out.println("Está vivo!");
    }

}
