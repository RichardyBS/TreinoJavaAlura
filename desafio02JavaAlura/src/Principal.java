import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        Musica musica = new Musica();
        Carro car = new Carro();
        Aluno aluno = new Aluno();
        Pessoa pessoa = new Pessoa();
        pessoa.hello();

        aluno.nomeAluno = "Richardy";
        aluno.idade = 20;

        aluno.exibirInformacoesAluno(aluno.nomeAluno, aluno.idade);




    }
}
