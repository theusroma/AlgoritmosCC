public class Main {

    public static void main(String[] args) {


        Player p = new Player(2, 2);
        Inimigo a = new Inimigo(5, 6);

        Player[] personagens = new Player[2];
        Inimigo[] inimigos = new Inimigo[2];

        personagens[0] = new Player(1, 1);
        personagens[1] = new Player(2, 2);


        inimigos[0] = new Inimigo(3, 2);
        inimigos[1] = new Inimigo(4 , 2);



        for (int linha = 0; linha < 5; linha++) {

            for (int coluna = 0; coluna < 5; coluna++) {

                boolean tem = false;

                for (int i = 0; i < personagens.length; i++) {


                    if(personagens[i].posY == linha && personagens[i].posX == coluna){
                        System.out.print("[ X ]");
                        tem = true;
                        break;
                    }


                    if (inimigos[i].posY == linha && inimigos[i].posX == coluna){
                        System.out.print("[ A ]");
                        tem = true;
                        break;
                    }
                }

                if (!tem){
                    System.out.print("[ . ]");
                }


            }

            System.out.println();
        }

    }

}
