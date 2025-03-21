import java.util.Scanner; // Importamos a classe Scanner para ler os dados

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Criamos um Scanner para capturar a entrada do usuário

        // Pedimos os dados para o usuário
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = input.nextLine(); // Lendo um texto (nome)

        System.out.print("Digite o nome do professor responsável: ");
        String professor = input.nextLine(); // Lendo outro texto (professor)

        System.out.print("Digite o ano de matrícula: ");
        int anoMatricula = input.nextInt(); // Lendo um número inteiro (ano)

        // Criamos a ficha do aluno com os dados digitados
        FichaAluno aluno1 = new FichaAluno(nomeAluno, professor, anoMatricula);

        // Exibimos os dados da ficha
        System.out.println("\n--- Ficha do Aluno ---");
        System.out.println("Nome do Aluno: " + aluno1.getNomeAluno());
        System.out.println("Professor Responsável: " + aluno1.getProfessor());
        System.out.println("Ano de Matrícula: " + aluno1.getAnoMatricula());

        input.close(); // Fechamos o Scanner para evitar vazamento de memória
    }
}
