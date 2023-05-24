package br.com.minhasmusicas.modelos;

public class Audio {

    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classiicacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassiicacao() {
        return classiicacao;
    }

    public void curte(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }
}
