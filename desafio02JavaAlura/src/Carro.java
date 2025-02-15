import java.util.Scanner;

public class Carro {
    Scanner leitura = new Scanner (System.in);

    String[] modeloCar = {"Fusca","Ferrari","Camaro","BMW","VW"};

    int anoCarro;

    String[] corCarro = {"Amarelo" , "Vermelho" , "Preto" , "Branco" , "Cinza"};

    void fixaTecnicaCarro (String modeloCar, int anoCarro, String colorCar){
        System.out.println(modeloCar);
        leitura.nextLine();

        System.out.println(anoCarro);
        leitura.nextInt();

        System.out.println(colorCar);
        leitura.nextLine();

    }

    int idadeCarro (int idadeCarro){
        idadeCarro = 2024;
        return anoCarro % idadeCarro;
    }

}
