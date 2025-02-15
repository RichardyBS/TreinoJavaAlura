import java.util.Scanner;
import java.util.Random;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random gerador = new Random();
/*
        System.out.println("Digite seu Filme Favorito");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de Lancamento!");
        int anoFilme = leitura.nextInt();

        System.out.println("Digite a Avalicao com o filme de 0 a 10");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoFilme);
        System.out.println(avaliacao);""*/

        int randola = gerador.nextInt(1,100);


        while (true){
            System.out.println("'Digite o Numero e verei se ele esta correto'");
            int resposta = leitura.nextInt();

            if (resposta == randola){
            System.out.println("Dale");
                System.out.println("zerou a fita pae");
                break;
            } else if (resposta < randola) {
                System.out.println("Pra mais pae");
//                System.out.println(randola);
//                System.out.println("teste");

            } else if (resposta > randola) {
                System.out.println("pra menos pae");
//                System.out.println(randola);
//                System.out.println("teste");
            } else{
                System.out.println("chapou dog");
//                System.out.println(randola);
//                System.out.println("teste");
            }
            }
        }
    }

