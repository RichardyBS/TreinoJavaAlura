import java.util.Scanner;

public class OutroLoop {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a Avalicao com o filme de 0 a 10");
        double avaliacao = leitura.nextDouble();

        double mediaAvaliacao = 0;
        double nota = 0;
        int qtdPessoaVotaram = 1;

        while (true) {
            System.out.println("Digite se deseja Continuar \s 1 : para Continuar \s 2 : para Sair");
            int opcao = leitura.nextInt();

            if (1 == opcao) {
            System.out.println("Digite a Avalicao com o filme de 0 a 10");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;

            qtdPessoaVotaram ++;

            } else if (2 == opcao) {
                System.out.println("Programa Finalizado");
                System.out.println("Nota: " + nota);
                System.out.println("Avaliacao: " + mediaAvaliacao);
                System.out.println("Total de Pessoas que votaram foi de: " + qtdPessoaVotaram);
                break;
            } else
                System.out.println("chapou");
        }

    }
}
