import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
//        Random gerador = new Random();
        System.out.println("Digite a Avalicao com o filme de 0 a 10");
        double avaliacao = leitura.nextDouble();

        double mediaAvaliacao = 0;
        double nota = 0;

//        System.out.println(filme);
//        System.out.println(anoFilme);
//        System.out.println(avaliacao);
//    

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a Avalicao com o filme de 0 a 10");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de Avaliacao" + mediaAvaliacao/3);



    }
}
