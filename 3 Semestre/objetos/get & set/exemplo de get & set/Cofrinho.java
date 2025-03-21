public class Cofrinho {
    private int moedas; // O total de moedas está guardado de forma privada 🏦

    // Método SET (coloca moedas no cofrinho)
    public void setMoedas(int quantidade) {
        this.moedas = quantidade;
    }

    // Método GET (vê quantas moedas tem no cofrinho)
    public int getMoedas() {
        return moedas;
    }
}
