public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.nome = "As Branquelas";
        meuFilme.somaDasAvaliacoes = 10;
        meuFilme.tempoFilme = 120.54;
        meuFilme.anoLancamento = 2006;
        meuFilme.incluidoPlano = true;

        meuFilme.exibeFixaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
    };

}
