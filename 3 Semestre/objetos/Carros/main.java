import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////        Scanner l = new Scanner();
//
//        Carro meuCarro = new Carro("Branco", 2020);
//        Carro outroCarro = new Carro("Nego", 2019);
//
//        System.out.println(meuCarro.ano);
//        System.out.println(outroCarro.ano);
//
//        System.out.println(meuCarro.modelo + meuCarro.ano);
//        System.out.println(outroCarro.modelo);
//
////        Carro meuCarro = new Carro();
////        meuCarro.marca = "R";
////        meuCarro.modelo = "Branco";

        Carro[] carros = new Carro[2];

        for (int i=0; i < carros.length; i++){

            String marca = ""; //input
            int ano = 1010;    //input

            carros[i] = new Carro(marca, ano);

//            Carro novoCarro = new Carro(marca, ano);
//            carros[i] = novoCarro;
        }
    }
}
