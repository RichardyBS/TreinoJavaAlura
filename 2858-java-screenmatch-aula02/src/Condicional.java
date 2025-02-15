public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String TipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("Lancamento que os Clientes estao curtindo");
        } else {
            System.out.println("Filme Retro Que Vale Apena Assistir");
        }

        if (incluidoNoPlano == true &&  TipoPlano.equals("plus")){
            System.out.println("Filme Liberado");

        } else {
            System.out.println("Paga o Aluguel");
        }


    }
}
