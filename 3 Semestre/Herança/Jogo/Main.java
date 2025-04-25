import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        Guerreiro g = new Guerreiro("Bárbaro", 100);
        Mago m = new Mago("Mago", 100);
        Arqueiro a = new Arqueiro("Arqueiro", 100);

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
                    System.out.println("Selecione o personagem que utilizar para o ataque: ");
                    System.out.println("[1]Guerreiro");
                    System.out.println("[2]Mago");
                    System.out.println("[3]Arqueiro");
                    int opcaoAtaque = leitor.nextInt();

                    System.out.println("Selecione o personagem que será atacado: ");
                    System.out.println("[1]Guerreiro");
                    System.out.println("[2]Mago");
                    System.out.println("[3]Arqueiro");
                    int opcaoRecebido = leitor.nextInt();

                    if (opcaoAtaque == 1){
                        if (opcaoRecebido == 2){
                            g.atacar(m);
                        }
                        else if (opcaoRecebido == 3){
                            g.atacar(a);
                        }
                        else {
                            System.out.println("Opcção inválida");
                        }
                    }


                    else if (opcaoAtaque == 2) {
                        if (opcaoRecebido == 1){
                            m.atacar(g);
                        }
                        else if (opcaoRecebido == 3){
                            m.atacar(a);
                        }
                        else {
                            System.out.println("Opção inválida");
                        }
                    }

                    else if (opcaoAtaque == 3){
                        if (opcaoRecebido == 2){
                            a.atacar(m);
                        }
                        else if (opcaoRecebido == 1){
                            a.atacar(g);
                        }
                        else {
                            System.out.println("Opção inválida");
                        }
                    }



                    break;


                case 2:
                    System.out.println("Selecione o personagem que deseja ver: ");
                    System.out.println("[1]Guerreiro");
                    System.out.println("[2]Mago");
                    System.out.println("[3]Arqueiro");
                    int opcaoVerPersonagem = leitor.nextInt();

                    if (opcaoVerPersonagem == 1){
                        g.mostrarPersonagem();
                    }
                    else if (opcaoVerPersonagem == 2) {
                        m.mostrarPersonagem();
                    }
                    else if (opcaoVerPersonagem == 3){
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
                        System.out.println();
                    }

            }



        }



//
//
//
//        m.receberDano();
//        System.out.println("O dano foi recebido");
//
//        m.mostrarPersonagem();
//        System.out.println();
//







    }
}
