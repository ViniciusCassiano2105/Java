package br.com.imperial_flix_filme;

public class Filme {
    int idFilme;
    String nome;
    String genero;
    int duracao;
    int idCinema; 

    public Filme() {
        super();
    }

    public Filme(int idFilme, String nome, String genero, int duracao, int idCinema) {
        this.idFilme = idFilme;
        this.nome = nome;
        this.genero = genero;
        this.duracao = duracao;
        this.idCinema = idCinema;  
    }

    public int getIdFilme() {
        return idFilme;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getIdCinema() {
        return idCinema;  
    }

    @Override
    public String toString() {
        return "Filme: " + nome + " -> Gênero: " + genero + " -> Duração: " + duracao + " minutos -> Cinema: " + idCinema;
    }
}
