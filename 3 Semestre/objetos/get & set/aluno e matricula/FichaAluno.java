public class FichaAluno {
    private String nomeAluno;  // Nome do aluno (equivalente ao título do livro)
    private String professor;  // Professor responsável (equivalente ao autor do livro)
    private int anoMatricula;  // Ano da matrícula (equivalente ao ano do livro)

    // Construtor: cria uma ficha do aluno com nome, professor e ano
    public FichaAluno(String nomeAluno, String professor, int anoMatricula) {
        this.nomeAluno = nomeAluno;
        this.professor = professor;
        this.anoMatricula = anoMatricula;
    }

    // Métodos GETTERS - Para ler os dados da ficha
    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getProfessor() {
        return professor;
    }

    public int getAnoMatricula() {
        return anoMatricula;
    }
}
