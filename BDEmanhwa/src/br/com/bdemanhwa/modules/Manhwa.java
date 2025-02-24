package br.com.bdemanhwa.modules;

public class Manhwa extends Livro {


    private String titulo;
    private String autor;
    private String sinopse;
    private int capitulos;
    private int dataObra;


    public Manhwa(String titulo, String autor, String sinopse, int capitulos, int dataObra) {
        this.titulo = titulo;
        this.autor = autor;
        this.sinopse = sinopse;
        this.capitulos = capitulos;
        this.dataObra = dataObra;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public void setDataObra(int dataObra) {
        this.dataObra = dataObra;
    }

    public void exibeManhwa() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Capítulos: " + capitulos);
        System.out.println("Ano da Obra: " + dataObra);
    }
}