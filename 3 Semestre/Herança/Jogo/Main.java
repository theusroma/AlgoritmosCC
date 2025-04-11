import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        Guerreiro g = new Guerreiro("Bárbaro", 100, 70);
        Mago m = new Mago("Mago", 100, 100);
        Arqueiro a = new Arqueiro("Arqueiro", 100, 50);

        Personagem[] personagens = new Personagem[3];
        personagens[0] = g;
        personagens[1] = m;
        personagens[2] = a;

        int op = 0;

        while(op != 4){
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] Atacar");
            System.out.println("[2] Mostrar personagem");
            System.out.println("[3] Mostrar TODOS os personagens e suas funções");
            System.out.println("[4] Sair");
            op = leitor.nextInt();

            switch (op){
                case 1:

                    break;


                case 2:
                    System.out.println("Selecione o personagem que deseja ver: ");
                    System.out.println("[1]Guerreiro");
                    System.out.println("[2]Mago");
                    System.out.println("[3]Arqueiro");
                    int opcao = leitor.nextInt();

                    if (opcao == 1){
                        g.mostrarPersonagem();
                    }
                    else if (opcao == 2) {
                        m.mostrarPersonagem();
                    }
                    else if (opcao == 3){
                        a.mostrarPersonagem();
                    }

                    break;

                case 3:
                    System.out.println("Todos os personagens: ");
//                    g.mostrarPersonagem();
//                    System.out.println();
//
//                    m.mostrarPersonagem();
//                    System.out.println();
//
//                    a.mostrarPersonagem();
//                    System.out.println();
                    for (Personagem p : personagens){
                        p.mostrarPersonagem();
                        p.atacar();
                        System.out.println();
                    }

            }



        }






        m.receberDano();
        System.out.println("O dano foi recebido");

        m.mostrarPersonagem();
        System.out.println();








    }
}