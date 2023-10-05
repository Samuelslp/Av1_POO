package questao2;

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso para Professor
        Professor professor = new Professor("Professor1", "professor1@example.com", "senha123", 50.0f, 20);
        System.out.println("Dados do Professor:");
        System.out.println(professor.mostraProfessor());

        // Exemplo de uso para Aluno
        Aluno aluno = new Aluno("Aluno1", "aluno1@example.com", "senha456", 2, 101);
        System.out.println("\nDados do Aluno:");
        System.out.println(aluno.mostraAluno());
    }
}