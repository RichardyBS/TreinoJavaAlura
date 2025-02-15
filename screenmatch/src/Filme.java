public class Filme {
    String nome;
    double tempoFilme;
    int somaDasAvaliacoes;
    int anoLancamento;
    boolean incluidoPlano;
    int totalDeAvaliacoes;

    void exibeFixaTecnica(){
        System.out.println("nome do Filme: " + nome);
        System.out.println("AvaliacaoFilme: " + somaDasAvaliacoes);
        System.out.println("tempo do Filme: " + tempoFilme);
        System.out.println("Plano: " + incluidoPlano);
        System.out.println("Ano do Filme: " + anoLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
       return somaDasAvaliacoes % totalDeAvaliacoes;
    }
}
