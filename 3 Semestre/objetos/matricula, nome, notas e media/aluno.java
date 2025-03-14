public class Aluno {
    String nome;
    float nota1, nota2;
    int matricula;
    void verMedia(){
        float media = (nota1 + nota2) / 2;
        System.out.println("Média Final: " + media);
    }
    float media(){
        return (nota1 + nota2) / 2;
    }
    void verMatricula(){
        System.out.println("Matricula: " + matricula);
    }
    void verNome(){
        System.out.println("Nome: " + nome);
    }

    void verNota1(){
        System.out.println("Nota 1: " + nota1);
    }

    void verNota2(){
        System.out.println("Nota 2: " + nota2);
    }



}
