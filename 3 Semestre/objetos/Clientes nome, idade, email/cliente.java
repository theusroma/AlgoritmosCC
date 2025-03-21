public class Cliente {
        String nome;
        String email;
        int idade;

        Cliente(String nome, String email, int idade){
            this.nome = nome;
            this.email = email;
            this.idade = idade;
        }

        void apresentar(){
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Email: " + email);

        }
}
