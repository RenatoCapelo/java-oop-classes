package JL_Class002;

import JL_Class002.Models.Aluno;

public class Exercise001 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Artur", "a123", 18);
        System.out.println("Nome: "+ aluno.nome + ", Número: "+aluno.numero +", Nota: "+ aluno.notaIP + ".");
    }
}
