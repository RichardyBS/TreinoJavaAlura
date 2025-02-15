import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Bem Vindo ao Grimm Manhwa!");

        int anoDeLancamento = 2024;

        int dateCap = 030424;

        double notaManhwa = 8.5;

        int cap = 22;

        String planoB = "PlanoBronze";
        String planoP = "PlanoPrata";
        String planoG = "PlanoGold";

        boolean incluidoNoPlano = true;

        System.out.println("Manhwa: Solo Leveling");

        System.out.println("Data da obra: " + anoDeLancamento);



        double mediaNotaManhwa = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(mediaNotaManhwa);

        String sinopse;

        sinopse = """
                Sinopse:
                \s
                "Manhwa Isekai no Qual o Pesonagem e o Mais Fraco do Mundo e com o Passar do tempo ele Evolui com suas ablidades para alcancar o Rank S"
                       \s
                """;

        System.out.println(sinopse);


        int classification;

        classification = (int) (mediaNotaManhwa / 2);

        System.out.println(classification);


        Scanner scanner = new Scanner (System.in);

        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os Clientes estao curtindo;");
        } else {
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano == true && planoB.equals("Bronze")){
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a localizacao");
        }
    }
}

