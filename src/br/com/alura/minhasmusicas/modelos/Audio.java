package br.com.alura.minhasmusicas.modelos;

import br.com.alura.minhasmusicas.principal.Funcionalidades;

public class Audio implements Funcionalidades {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private int classificao;

    @Override
    public void curtir() {
        this.curtidas++;
    }

    @Override
    public void reproduzir() {
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificao() {
        return classificao;
    }
}
