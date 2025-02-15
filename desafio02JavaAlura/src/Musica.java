
public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    double mediaAvaliacao;
    int totalAvaliacao;


    void exibirFichaTecnica (){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(somaAvaliacao);
    }


    void avaliaMusica(){
        System.out.println("De uma Nota para a musica: " + titulo + "\nDigite sua nota:     " + somaAvaliacao);
        totalAvaliacao ++;
    }

    double mediaAvaliacao(){
        return somaAvaliacao % totalAvaliacao;
    }

}
